import React, { useState } from 'react';
import './App.css';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    if (currency.toLowerCase() === 'euro') {
      const result = (amount / 90).toFixed(2);
      alert('Conversion to Euro amount is €'+result);
    } else {
      alert('Only Euro conversion is supported.');
    }
  };

  return (
    <div >
      <h2 style={{ color: 'green' ,fontSize:'2rem'}}>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <div style={{ paddingTop: '5px' }}>
          <label style={{ padding: '20px' }}>Amount:</label>
          <input
            type="text"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />
        </div>
        <div style={{ padding: '5px' }}>
          <label style={{ padding: '15px' }}>Currency:</label>
          <textarea
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
          />
        </div >
        <button style={{ padding: '10px', marginLeft:'100px' }} type="submit">Submit</button>
      </form>
    </div>
  );
}

function App() {
  const [count, setCount] = useState(5);

  const sayHello = () => {
    alert('Hello Member1');
  };

  const increment = () => {
    setCount(count + 1);
    sayHello(); 

  };

  const decrement = () => {
    setCount(count - 1);
  };

  const sayWelcome = (message) => {
    alert(message);
  };

  const handleClick = (e) => {
    alert('I was clicked');
    console.log('Synthetic event:', e);
  };

  return (
    <div style={{ padding: '20px' }}>
      <h3>{count}</h3>
      <button onClick={increment}>Increment</button>
      <br />
      <button onClick={decrement}>Decrement</button>
      <br />
      <button onClick={() => sayWelcome('Welcome to React Events!')}>Say welcome</button>
      <br />
      <button onClick={handleClick}>Click on me</button>

      <hr />

      <CurrencyConvertor />
    </div>
  );
}

export default App;
