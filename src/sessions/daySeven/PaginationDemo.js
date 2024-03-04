import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { Pagination, Table } from 'react-bootstrap';

const PaginationDemo = () => {
    const [data, setData] = useState([]);
    const [currentPage, setCurrentPage] = useState(1);
    const itemsPerPage = 10;

    useEffect(() => {
      axios
      .get("https://657bb210394ca9e4af14a223.mockapi.io/json/Userdata")
      .then((res)=>{setData(res.data)})
      .catch(err=>console.log(err))
    }, [])
    
    const indexOfLastItem = currentPage * itemsPerPage;
    const indexOfFirstItem = indexOfLastItem - itemsPerPage;
    const currentItems = data.slice(indexOfFirstItem, indexOfLastItem);

    const paginate = (pageNum) => setCurrentPage(pageNum);
    
    return (
        <div className='container mt-5'>
        <h1>React Pagination Demo</h1>
        <Table striped bordered hover>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Gender</th>
                    <th>Country</th>
                </tr>
            </thead>

            <tbody>
                {currentItems.map((item)=>(
                    <tr key = {item.id}>
                        <td>{item.id}</td>
                        <td>{item.name}</td>
                        <td>{item.gender}</td>
                        <td>{item.Country}</td>
                    </tr>
                ))}
            </tbody>

        </Table>

        <Pagination>
            {Array.from({length: Math.ceil(data.length/itemsPerPage)})
            .map((_, index)=>(
                <Pagination.Item
                key = {index}
                active = {index + 1 ===currentPage}
                onClick={()=>paginate(index+1)}>
                    {index+1}
                </Pagination.Item>
            ))
            }
        </Pagination>



        </div>
    )
}

export default PaginationDemo