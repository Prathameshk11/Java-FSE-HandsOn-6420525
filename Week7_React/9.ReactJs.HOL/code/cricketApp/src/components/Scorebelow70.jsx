const Scorebelow70 = ({ players }) => {
  const lowScorers = players.filter(p => p.score < 70);
  return (
    <ul>
      {lowScorers.map((player, idx) => (
        <li key={idx}>
          {player.name} - {player.score}
        </li>
      ))}
    </ul>
  );
};

export default Scorebelow70;
