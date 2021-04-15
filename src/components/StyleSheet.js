import React, { Component } from 'react'
import PropTypes from 'prop-types'
import './myStyle.css'

export class StyleSheet extends Component {
    static propTypes = {

    }

    render() {
        return (
            <div className='primary'>
                <h1>Stylesheet</h1>
            </div>
        )
    }
}

export default StyleSheet
