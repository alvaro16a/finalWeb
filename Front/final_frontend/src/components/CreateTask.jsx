import React, { Fragment, useState } from 'react'
//useState nos permite trabajar con hooks
const CreateTask = () => {
    //un boton de tipo submit implica que cada vez que se presione se ejecuta el evento asociado al formulario
    //el evento onChange esta pendiente de los cambios que se registren en nuestro input
    const [datos, setDatos] = useState({ //al presionar el boton crearemos un objeto de la clase Task
        name: ''
    })

    const cambioInputTask = (event) => {
        //console.log(event.target.value) //asi extraemos el valor de la entrada
        setDatos({
            ...datos,
            [event.target.name]: event.target.value //realiza una relacion entre los inputs y la clase
        })
    }

    const sendTask =(event) => {
        event.preventDefault (); //Asi evitamos el procesamiento automatico del formulario
        console.log("AQUI CREO EL POST" +datos.name); 
    }
    return (
        <Fragment>
            <table align="center" >
                <td colSpan="3">
                    <input
                        placeholder="Lista de To-Do"
                        type="text"
                        name="name"
                        onChange={cambioInputTask}
                    ></input>
                </td>
                <td colSpan="2">
                    <form className='row' onSubmit={sendTask}>
                        <button className='button muted-button mx-1' type="submit"> Nueva Lista</button>
                    </form>
                </td>
            </table>
        </Fragment>
    );
}

export default CreateTask;