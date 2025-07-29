import ListofPlayers from './components/ListofPlayers';
import Scorebelow70 from './components/Scorebelow70';
import { OddPlayers } from './components/OddPlayers';
import { EvenPlayers } from './components/EvenPlayers';
import ListofIndianPlayers from './components/ListofIndianPlayers';
import { IndianPlayers } from './data/players';

function App() {
  const flag = true;

  const players = [
    { name: 'Rohit Sharma', score: 95 },
    { name: 'Shubman Gill', score: 65 },
    { name: 'Virat Kohli', score: 88 },
    { name: 'Shreyas Iyer', score: 58 },
    { name: 'KL Rahul', score: 74 },
    { name: 'Hardik Pandya', score: 49 },
    { name: 'Ravindra Jadeja', score: 70 },
    { name: 'R Ashwin', score: 52 },
    { name: 'Jasprit Bumrah', score: 67 },
    { name: 'Mohammed Siraj', score: 43 },
    { name: 'Kuldeep Yadav', score: 55 }
  ];


  const IndianTeam = IndianPlayers;

  if (flag) {
    return (
      <div>
        <h1>List of Players</h1>
        <ListofPlayers players={players} />
        <hr />
        <h1>List of Players having Scores Less than 70</h1>
        <Scorebelow70 players={players} />
      </div>
    );
  } else {
    return (
      <div>
        <h1>Indian Team</h1>
        <h2>Odd Players</h2>
        <OddPlayers players={IndianTeam} />
        <hr />
        <h2>Even Players</h2>
        <EvenPlayers players={IndianTeam} />
        <hr />
        <h2>List of Indian Players Merged:</h2>
        <ListofIndianPlayers IndianPlayers={IndianPlayers} />
      </div>
    );
  }
}

export default App;
