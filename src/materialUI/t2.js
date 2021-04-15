<TableContainer style={{ maxHeight: '67vh' }} component={Paper}>
    <Table aria-labelledby="tableTitle" stickyHeader className={classes.table} aria-label="customized table">
        <TableHead
            numSelected={selected.length}
            onSelectAllClick={handleSelectAllClick}
            rowCount={rows.length}>
            <TableRow>
                <StyledTableCell padding="checkbox">
                    <StyledCheckbox
                        indeterminate={selected.length > 0 && selected.length < rows.length}
                        checked={rows.length > 0 && selected.length === rows.length}
                        onChange={handleSelectAllClick}
                        inputProps={{ 'aria-label': 'select all desserts' }}
                    />
                </StyledTableCell>
                <StyledTableCell>Customer Name</StyledTableCell>
                <StyledTableCell>Customer #</StyledTableCell>
                <StyledTableCell>Invioce #</StyledTableCell>
                <StyledTableCell>Invioce Amount</StyledTableCell>
                <StyledTableCell align="right">Due Date</StyledTableCell>
                <StyledTableCell align="right">Predicted Payment Date</StyledTableCell>
                <StyledTableCell>Predicted Aging Bucket</StyledTableCell>
                <StyledTableCell>Notes</StyledTableCell>
            </TableRow>
        </TableHead>
        <TableBody>
            {rows.map((row, index) => {
                const isItemSelected = isSelected(row.name);
                const labelId = `enhanced-table-checkbox-${index}`;
                return (
                    <StyledTableRow
                        onClick={(event) => handleClick(event, row.name)}
                        role="checkbox"
                        aria-checked={isItemSelected}
                        tabIndex={-1}
                        key={row.name}
                        selected={isItemSelected}
                    >
                        <TableCell className="selectCheckbox" padding="checkbox">
                            <StyledCheckbox
                                checked={isItemSelected}
                                inputProps={{ 'aria-labelledby': labelId }}
                            />
                        </TableCell>
                        <StyledTableCell component="th" id={labelId} scope="row">
                            {row.name}
                        </StyledTableCell>
                        <StyledTableCell>{row.cid}</StyledTableCell>
                        <StyledTableCell>{row.iid}</StyledTableCell>
                        <StyledTableCell>{row.iamount}</StyledTableCell>
                        <StyledTableCell align="right">{row.dd}</StyledTableCell>
                        <StyledTableCell align="right">{row.ppd}</StyledTableCell>
                        <StyledTableCell>{row.pab}</StyledTableCell>
                        <StyledTableCell>{row.notes}</StyledTableCell>
                    </StyledTableRow>
                )
            })}
        </TableBody>
    </Table>
</TableContainer>