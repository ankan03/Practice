import React from 'react'
// import { createStyles, makeStyles, Theme } from '@material-ui/core/styles';
import AppBar from '@material-ui/core/AppBar';
import Toolbar from '@material-ui/core/Toolbar';
import Typography from '@material-ui/core/Typography';
import { Button } from '@material-ui/core';
// import Button from '@material-ui/core/Button';
// import IconButton from '@material-ui/core/IconButton';

function Header() {
    return (

        <div>
            <Button variant="contained">Default</Button>
            <Button variant="contained" color="primary">
                Primary
</Button>
            <Button variant="contained" color="secondary">
                Secondary
</Button>
            <Button variant="contained" disabled>
                Disabled
</Button>
            <Button variant="contained" color="primary" href="#contained-buttons">
                Link
</Button>
        </div>
        // <AppBar position="static">
        //     <Toolbar>
        //         <IconButton edge="start" className={classes.menuButton} color="inherit" aria-label="menu">
        //             <MenuIcon />
        //         </IconButton>
        //         <Typography variant="h6" className={classes.title}>
        //             News
        //   </Typography>
        //         <Button color="inherit">Login</Button>
        //     </Toolbar>
        // </AppBar>
    )
}

export default Header
