import React from 'react';
import Action from './components/Action';
import Headboard from './components/Headboard';


function App() {
  return (
    <div>
      <table border width="50%" align="center" >
        <Headboard/>
        <Action />
        <Action />
        <Action />
        <Action />
      </table>
    </div>
  );
}

export default App;
