import React from 'react';
import CreateTask from './components/CreateTask';
import Task from './components/Task';


function App() {


  return (
    <div className='container mt-5'>
      <CreateTask/>
      <Task/>
      <Task/>
      <Task/>
    </div>
  );
}

export default App;
