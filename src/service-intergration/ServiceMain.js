import React from 'react'
import Service from './Service'
import ServiceForPost from './ServiceForPost'
import ServiceForUpdate from './ServiceForUpdate'
import ServiceForDelete from './ServiceForDelete'

const ServiceMain = () => {
  return (
    <div>
        <Service/>
        <ServiceForPost/>
        <ServiceForUpdate/>
        <ServiceForDelete/>
    </div>
  )
}

export default ServiceMain