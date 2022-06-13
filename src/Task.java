public class Task {
	private String content;

	private boolean completed;

	public Task(String content) {
		this.content = content;
		completed = false;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
	@Override
	public String toString(){
		return content;
	}
}
