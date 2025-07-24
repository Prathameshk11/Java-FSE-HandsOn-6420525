class Post {
  constructor(id, title, body) {
    this.id = id;
    this.title = title;
    this.body = body;
  }

  display() {
    return `Post #${this.id}\nTitle: ${this.title}\nBody: ${this.body}`;
  }
}

export default Post;
