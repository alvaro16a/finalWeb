import React, { Fragment, useEffect, useState } from 'react';
import CreateTask from './components/CreateTask';
import TaskTable from './components/TaskTable';

function App() {

  const [tasks, setTasks] = useState([])
  const [actions, setActions] = useState([])
  const HOST_API = "http://localhost:8080/api"

 

  const getTasks = async () => {
    const data = await fetch(HOST_API + '/tasks')
    setTasks(await data.json())
  }

  const getActions = async () => {
    const data = await fetch(HOST_API + '/actions')
    setActions(await data.json())
  }

  const postTask = async (data) => {
    const request = { name: data };
     fetch(HOST_API + "/task", {
      method: "POST",
      body: JSON.stringify(request),
      headers: {
        'Content-Type': 'application/json'
      }
    }).then(getTasks)
    
  }
  const postAction = async (name, task) => {
    const request = { name: task.name,id:task.id};
    fetch(HOST_API + "/action/"+name, {
      method: "POST",
      body: JSON.stringify(request),
      headers: {
        'Content-Type': 'application/json'
      }
    }).then(getActions)
  }

  const putAction = async (action,name,check) => {
    const request = action
    request.name=name
    request.completed=check
    
    fetch(HOST_API + "/action", {
      method: "PUT",
      body: JSON.stringify(request),
      headers: {
        'Content-Type': 'application/json'
      }
    }).then(getActions)
  }

  const deleteTask = async (id) => {
    fetch(HOST_API + "/task/"+id, {
      method: "DELETE",
      headers: {
        'Content-Type': 'application/json'
      }
    }).then(getTasks)
  }

  const deleteAction = async (id) => {
    fetch(HOST_API + "/action/"+id, {
      method: "DELETE",
      headers: {
        'Content-Type': 'application/json'
      }
    }).then(getActions)
  }



  useEffect(() => {           //cuando se pinta nuestra pantalla llamamos a tareas
    getTasks()
    getActions()
  }, [])
  // <div className="flex-row">

  return (
    <Fragment>
      <CreateTask addTask ={postTask}/>
      <TaskTable tasks={tasks} deleteTask={deleteTask} addAction={postAction} actions={actions} deleteAction={deleteAction} editeAction={putAction}/>
    </Fragment>
  );
}

export default App;
