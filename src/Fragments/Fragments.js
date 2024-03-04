import React from 'react'

const Fragments = ({data}) => {
  return (
    <>
        {data.map((item, index)=> 
            {
                return(
                    <React.Fragment key = {{item, index}}>
                        <p>{item.id}</p>
                        <p>{item.name}</p>
                    </React.Fragment>
                )
            }
        )}
    </>
  )
}

export default Fragments
