const StyledTableCell = withStyles((theme) => ({
    head: {
        backgroundColor: "#2E4350",
        color: theme.palette.common.white,
        borderBottom: '2px solid #283A46',
        fontSize: '0.9vw',
        color: '#97A1A9',
        paddingTop: '0px',
        paddingBottom: '0px',
    },
    body: {
        fontSize: '1.1vw',
        color: 'white',
        paddingTop: '0px',
        paddingBottom: '0px',
    },
}))(TableCell);

const StyledTableRow = withStyles((theme) => ({
    root: {
        '&:nth-of-type(even)': {
            backgroundColor: '#283A46',
        },
        '&:nth-of-type(odd)': {
            backgroundColor: '#2F4451',
            borderTop: '2px solid #2F4451',
            borderBottom: '2px solid #2F4451',
        },
        '&:hover': {
            backgroundColor: '#2A5368'
        }
    },
}))(TableRow);

const StyledButtonSolid = withStyles({
    root: {
        background: 'linear-gradient(45deg, #14AFF1 30%, #14AFF1 90%)',
        borderRadius: 7,
        border: 0,
        color: 'white',
        height: '2.3vw',
        padding: '0vw 1.2vw',
        margin: '0.3vw 0.3vw',
        fontSize: '1vw',
    },
    label: {
        textTransform: 'capitalize',
    },
})(Button);

const StyledCheckbox = withStyles({
    root: {
        '&$checked': {
            color: '#14AFF1',
        },
        color: '#97A1A9',
        height: '1vw',
    },
    checked: {},
})(Checkbox);

const useStyles = makeStyles({
    table: {
        minWidth: 700,
    },
    button: {
        '& > *': {
            background: 'linear-gradient(45deg, #FE6B8B 30%, #FF8E53 90%)',
            color: 'white',
        },
    },
    underline: {
        "&&&:before": {
            borderBottom: "none"
        },
        "&&:after": {
            borderBottom: "none"
        }
    },
    '@global': {
        '*::-webkit-scrollbar': {
            width: '0.4em'
        },
        '*::-webkit-scrollbar-track': {
            '-webkit-box-shadow': 'inset 0 0 6px rgba(0,0,0,0.00)',
            backgroundColor: '#2E4350',
        },
        '*::-webkit-scrollbar-thumb': {
            backgroundColor: '#61707B',
            outline: '1px solid slategrey',
        }
    },
    disabledButton: {
        color: 'white !important',
        background: 'linear-gradient(45deg, #97A1A9 30%, #97A1A9 90%)',
    }
});