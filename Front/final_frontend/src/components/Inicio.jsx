import React, { Fragment, useState } from 'react'

const Inicio = (props) => {


    return (
        <Fragment>
            <form >
                <input
                    name = "nuevaTarea"
                    className='m-2'
                    placeholder="Lista de TO_DO">
                </input>
                <button type='submit'>"Nueva lista"</button>
            </form>
        </Fragment>
    );
}

export default Inicio;