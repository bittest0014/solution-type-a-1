package problem02;

public class SmartPhone extends MusicPhone {
	public String runApp() {
		playMusic();
		return null;
	}
	public String playMusic() {
		return "스트리밍";
	}
	public String call () {
		return "앱실행";
	}
}