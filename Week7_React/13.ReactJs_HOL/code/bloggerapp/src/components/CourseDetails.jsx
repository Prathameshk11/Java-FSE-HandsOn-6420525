function CourseDetails({ data }) {
  return (
    <div>
      {data.map((course) => (
        <div key={course.id}>
          <h3>{course.name}</h3>
          <p>{course.date}</p>
        </div>
      ))}
    </div>
  );
}
export default CourseDetails;
