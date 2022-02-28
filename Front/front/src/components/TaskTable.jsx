import React, { Fragment } from 'react'
import ActionTable from './ActionTable';
import CreateAction from './CreateAction';



const TaskTable = (props) => {




   

    const deleteTask =(id) =>{
        const actionsToDelete= props.actions.filter(action => action.task.id == id)
        actionsToDelete.map(action => props.deleteAction(action.id))
        props.deleteTask(id)
    }

    return (
        <Fragment border="5">
            {
                props.tasks.length > 0 ?
                    props.tasks.map(task =>
                        <table border="5" align="center" >
                            <tr>
                                <th colSpan="2">{task.name}</th>
                                <button
                                    className='button muted-button mx-1'
                                    onClick={() => { deleteTask(task.id) }}
                                >Eliminar</button>
                            </tr><tr>
                                <CreateAction task={task} addAction={props.addAction} />
                            </tr>
                            <tr>
                                <ActionTable editeAction={props.editeAction} deleteAction={props.deleteAction} actions={props.actions.filter(action => action.task.id == task.id)}/>
                            </tr>

                        </table>
                    ) : (
                        <tr>
                            <h1 >No hay Tareas</h1>
                        </tr>
                    )
            }
        </Fragment>
    );
}

export default TaskTable;