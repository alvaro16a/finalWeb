import React from 'react'

const CreateAction = () => {
    return (
        <tr>
            <td colSpan="3"><input
                    placeholder="Que piensas hacer">
                </input></td>
            <td colSpan="2"><button
                className='button muted-button mx-1'>
                Crear</button>
            </td>
        </tr>
    );
}

export default CreateAction;