import React from 'react';
import { useForm } from 'react-hook-form';

const CreateAction = (props) => {

    const { register, handleSubmit, formState: { errors } } = useForm()


    const onSubmit = (data, e) => {
        props.addAction(data.newAction,props.task)
        //console.log(props.taks)
        e.target.reset()
    }


    return (
        <div>
            <form onSubmit={handleSubmit(onSubmit)}>
                <td >
                    <input
                        placeholder="Lista de To-Do"
                        type="text"
                        name="newAction"
                        {...register('newAction', {
                            required: { value: true, message: 'Se necesita un nombre' },
                            minLength: { value: 3, message: ' minimo 3 letras' },
                            maxLength: { value: 15, message: 'maximo 15 letras' }
                        })
                        } />
                        <span className='text-danger text-small d-block'>
                        {errors?.newAction?.message}
                    </span>
                </td>
                <td >
                    <button > Nueva Accion</button>
                </td>
            </form>
        </div>
    );
}

export default CreateAction;