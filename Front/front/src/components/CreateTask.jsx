import React from 'react'
import { useForm } from 'react-hook-form';

const CreateTask = (props) => {

    const { register, handleSubmit, formState: { errors } } = useForm()

    const onSubmit = (data, e) => {
        props.addTask(data.newTask)
        e.target.reset()
    }

    return (
        <form onSubmit={handleSubmit(onSubmit)}>
            <table align="center" >
                <td colSpan="3">
                    <input
                        placeholder="Lista de To-Do"
                        name="newTask"
                        className='form-control mx-4 '
                        type="text"
                        {...register('newTask', {
                            required: { value: true, message: 'Se necesita un nombre' },
                            minLength: { value: 3, message: 'El nombre debe tener minimo 3 letras' },
                            maxLength: { value: 15, message: 'El nombre debe tener maximo 15 letras' }
                        })
                        } />
                    <span className='text-danger text-small d-block'>
                        {errors?.newTask?.message}
                    </span>
                </td>
                <td colSpan="2">
                    <button > Nueva Tarea</button>
                </td></table>
        </form>
    );
}

export default CreateTask;