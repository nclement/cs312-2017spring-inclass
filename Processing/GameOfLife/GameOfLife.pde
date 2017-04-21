boolean[][] alive;
int cellSize = 10;

void setup() {
  size(500, 500);
  int numX = width / cellSize;
  int numY = height / cellSize;
  
  alive = new boolean[numY][numX];
  //randomizeBoard(alive);
  alive[20][20] = true;
  alive[21][20] = true;
  alive[20][21] = true;
  alive[20][22] = true;
  alive[22][21] = true;
  drawBoard(alive);
  nextGeneration(alive);
}

void draw() {
  background(0);
  frameRate(1000);
  alive = nextGeneration(alive);
  drawBoard(alive);
}

boolean[][] nextGeneration(boolean[][] curBoard) {
  int numY = curBoard.length;
  int numX = curBoard[0].length;
  boolean[][] nextBoard = new boolean[numY][numX];
  
  for (int i = 0; i < curBoard.length; i++) {
    for (int j = 0; j < curBoard[i].length; j++) {
      int n = countNeighbors(curBoard, j, i);
      // If I'm currently alive
      if (curBoard[i][j]) {
        // Survive with friends.
        if (n == 2 || n == 3) {
          nextBoard[i][j] = true; 
        } else {
          nextBoard[i][j] = false;
        }
      } else {
        // Currently I'm dead
        if (n == 3) {
          nextBoard[i][j] = true; 
        }
      }
    }
  }
  
  return nextBoard;
}

// x = 0; y = 0
int countNeighbors(boolean[][] board, int x, int y) {
  int neighbors = 0;

  for (int i = y - 1; i <= y + 1; i++) {
    for (int j = x - 1; j <= x + 1; j++) {
      int here_y = (i + board[0].length) % board[0].length;
      int here_x = (j + board.length) % board.length;
      if (board[here_y][here_x]) {
        neighbors++; 
      }
    }
  }
   
  if (board[y][x]) {
    neighbors--; 
  }
  
  return neighbors;
}

void drawBoard(boolean[][] cells) {
  noFill();
  stroke(0);
  for (int i = 0; i < cells.length; i++) {
    for (int j = 0; j < cells[0].length; j++) {
      if (cells[i][j]) {
        fill(255,105,180); 
      } else {
        noFill(); 
      }
      rect(j * cellSize, i * cellSize, cellSize, cellSize); 
    }
  }
}

void randomizeBoard(boolean[][] board) {
  for (int i = 0; i < board.length; ++i) {
    for (int j = 0; j < board[i].length; ++j) {
      if (random(1) > 0.9) {
         board[i][j] = true; 
      } else {
         board[i][j] = false;
      }
    }
  }
}