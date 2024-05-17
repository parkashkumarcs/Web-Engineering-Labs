function ListGroup(){
    const items=[
        "New York",
        "Pakistan",
        "Nepal",
        "India",
        "Iran",
        "China"
    ]
    
    return(
        <>
        <ul className="list-group">
            {
            items.map((item) =>(
            <ol><li>{item}</li></ol>    
        ))}
        </ul>
        </> 
    );
}
export default ListGroup;