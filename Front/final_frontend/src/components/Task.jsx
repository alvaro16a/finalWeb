import React from 'react'

import EditTask from './EditTask';
import CreateAction from './CreateAction';
import LabelActions from './LabelActions';
import Action from './Action';

const Task = () => {
    return (
        <table border="5" align="center" >
            <EditTask />
            <CreateAction />
            <LabelActions />
            <Action />
        </table>
    );
}

export default Task;