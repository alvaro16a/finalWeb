import React from 'react';



const ActionTable = (props) => {

    const handlechange = (action) => {
       
        props.editeAction(action, action.name, !action.completed);
    };

    return (
        <div>
            {
                props.actions.length > 0 ?
                    <form>
                        <table>
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Tarea</th>
                                    <th>Completado</th>
                                </tr>
                            </thead>
                            <tbody>
                                {

                                    props.actions.map(action =>
                                        <tr>
                                            <td align="center">{action.id}</td>
                                            {action.completed ?
                                                <td align="center"><del>{action.name}</del></td>
                                                : <td align="center">{action.name}</td>
                                            }
                                            <td align="center"><input type="checkbox" checked={action.completed} onChange={()=>{props.editeAction(action, action.name, !action.completed)}}/></td>
                                            <td align="right"><button onClick={() => { props.deleteAction(action.id) }}> Eliminar</button></td>
                                            <td><button > Editar</button></td>
                                        </tr>
                                    )
                                }
                            </tbody>
                        </table>
                    </form>
                    :
                    <tr>

                    </tr>
            }
        </div>
    );
}

export default ActionTable;