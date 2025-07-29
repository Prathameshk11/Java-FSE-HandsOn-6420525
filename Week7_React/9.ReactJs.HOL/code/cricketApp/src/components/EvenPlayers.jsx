export function EvenPlayers({ players }) {
  const [firstEven, secondEven, , fourthEven, , sixthEven] = players;
  return (
    <ul>
      <li>Second: {firstEven}</li>
      <li>Fourth: {secondEven}</li>
      <li>Sixth: {fourthEven}</li>
      <li>Eighth: {sixthEven}</li>
    </ul>
  );
}
