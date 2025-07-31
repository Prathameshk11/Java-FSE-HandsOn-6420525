import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";

function App() {
  const books = [
    { id: 1, bname: "Master React", price: 670 },
    { id: 2, bname: "Deep Dive into Angular 11", price: 800 },
    { id: 3, bname: "Mongo Essentials", price: 450 },
  ];

  const blogs = [
    { id: 1, title: "React Learning", author: "Stephen Biz", content: "Welcome to learning React!" },
    { id: 2, title: "Installation", author: "Schewzdenier", content: "You can install React from npm." },
  ];

  const courses = [
    { id: 1, name: "Angular", date: "4/5/2021" },
    { id: 2, name: "React", date: "6/3/2021" },
  ];

  const showCourses = true;
  const showBooks = true;

  return (
    <div className="app-container">
      
      <div className="section">
        <h1>Course Details</h1>
        {showCourses ? <CourseDetails data={courses} className="info"/> : <p>Courses not available</p>}
      </div>
      
      <div className="section">
        <h1>Book Details</h1>
        {showBooks && <BookDetails books={books} className="info"/>}
      </div>

      <div className="section">
        <h1>Blog Details</h1>
        <BlogDetails blogs={blogs} className="info"/>
      </div>

    </div>

  );
}

export default App;

