import React from 'react';

const TaskTable = (props) => {

    const actions = [
        { "id": 1, "name": "limpiar", "complete": false, "task": { "id": 2, "name": "actualizar" } },
        { "id": 3, "name": "barrer", "complete": true, "task": { "id": 2, "name": "actualizar" } },
        { "id": 4, "name": "trapiar", "complete": false, "task": { "id": 4, "name": "organizar" } }
    ]


    return (

        <div>
            <table>
                <tr>
                    <th><h1>Actualizar</h1></th>
                    <th width="35%" align="center" ><button type='submit'>"Elininar"</button></th>
                </tr>
            </table>
            <input
                name="nuevaTarea"
                className='mx-1'
                placeholder="¿Que piensas hacer?">
            </input>
            <button type='submit'>"Crear"</button>
            <table className='mx-3'>
                <thead>
                    <tr>
                        <th width="10%" align="center" >ID</th>
                        <th width="10%" align="center" >Tarea</th>
                        <th width="10%" align="center" >¿Completado?</th>
                    </tr>
                </thead>
                <tbody>{
                    actions.length > 0 ?
                        actions.map(action => (
                            <tr key={action.id} >
                                <td >{action.id}</td>
                                <td>{action.name}</td>
                                <td align="center">si</td>
                                <td>
                                    <button
                                        className='button muted-button mx-1'>
                                        Eliminar</button>
                                    <button
                                        className='button muted-button'>
                                        Editar</button>
                                </td>
                            </tr>
                        )) : (
                            <tr>
                                <td colSpan={3}>No hay actividades</td>
                            </tr>
                        )
                }
                </tbody>
            </table>
        </div>
    );
}

export default TaskTable;