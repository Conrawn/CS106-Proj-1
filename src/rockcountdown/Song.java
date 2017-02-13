package rockcountdown;

public class Song {

	private int rank;
	private String title;
	private String artist;

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public Song(int rank, String title, String artist) {
		super();
		this.rank = rank;
		this.title = title;
		this.artist = artist;
	}

	public Song(String info) {
		super();
		String[] strings = info.split("\t");
		rank = Integer.parseInt(strings[0]);
		title = strings[1];
		artist = strings[2];

	}

}
