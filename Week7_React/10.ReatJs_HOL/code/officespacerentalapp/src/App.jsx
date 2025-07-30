import React from 'react';
import './App.css';

const App = () => {
  const offices = [
    { Name: 'DBS', Rent: 50000, Address: 'Chennai', imgSrc: 'https://imgs.search.brave.com/RJ9_5CCHnB5u14ae9OvRMLNjvyhtHCtxRJrg5STvz7c/rs:fit:500:0:1:0/g:ce/aHR0cHM6Ly90aHVt/YnMuZHJlYW1zdGlt/ZS5jb20vYi9tb2Rl/cm4tb2ZmaWNlLWlu/dGVyaW9yLTI1ODky/MzAxLmpwZw' },
    { Name: 'WeWork', Rent: 65000, Address: 'Mumbai', imgSrc: 'https://imgs.search.brave.com/I3sQcpl4m-jFzMECtVGa6uVEYCqzW3rDaAn-6QFOd9M/rs:fit:500:0:1:0/g:ce/aHR0cHM6Ly9jZW50/dXJ5cGx5LmNvbS9i/bG9naW1hZ2Uvb2Zm/aWNlXzEucG5n' },
    { Name: 'Regus', Rent: 40000, Address: 'Bangalore', imgSrc: 'https://imgs.search.brave.com/MwJxtPPPujoLfuCSClFkIowUjGovO0fTtK1wh8mdGM8/rs:fit:500:0:1:0/g:ce/aHR0cHM6Ly9jZG4u/ZGVjb3JpbGxhLmNv/bS9vbmxpbmUtZGVj/b3JhdGluZy93cC1j/b250ZW50L3VwbG9h/ZHMvMjAyMi8wMy9N/b2Rlcm4tT2ZmaWNl/LUludGVyaW9yLXdp/dGgtT3Blbi1GbG9v/ci1QbGFuLXNjYWxl/ZC5qcGVnP3dpZHRo/PTkwMA' }
  ];

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1>Office Space, at Affordable Range</h1>

      {offices.map((item, index) => {
        const rentColor = item.Rent <= 60000 ? 'textRed' : 'textGreen';
        return (
          <div key={index} style={{ border: '1px solid #ccc', margin: '20px 0', padding: '10px' }}>
            <img src={item.imgSrc} width="25%" height="25%" alt="Office Space" />
            <h2>Name: {item.Name}</h2>
            <h3 className={rentColor}>Rent: Rs. {item.Rent}</h3>
            <h3>Address: {item.Address}</h3>
          </div>
        );
      })}
    </div>
  );
};

export default App;
