public class PedestrianAtBestChorus {
	public static void main(String[] args) {
		chorus();							// Calling (running) the chorus method
		System.out.println();
		chorus();							// Calling the chorus method again
	}

	// This method prints the first two lines of the chorus for the song
	public static void chorus() {
		System.out.println("Put me on a pedestal and I'll only disappoint");
		System.out.println("You tell me I'm exceptional and I promise to exploit you");
	}
}