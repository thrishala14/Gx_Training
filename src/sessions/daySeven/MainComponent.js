import { Button, Form } from 'react-bootstrap'
import 'bootstrap/dist/css/bootstrap.min.css';
import React from 'react'

const MainComponent = () => {
  return (
    <>
        <div className='buttons'>
            <Button variant = "primary">Primary</Button>
            <Button variant = "secondary">Primary</Button>
            <Button variant = "success">Primary</Button>
            <Button variant = "warning">Primary</Button>
            <Button variant = "danger">Primary</Button>
            <Button variant = "info">Primary</Button>
            <Button variant = "light">Primary</Button>
            <Button variant = "dark">Primary</Button>
            <Button variant = "outline-primary">Primary</Button>
        </div>

        <Form>
            <Form.Group>
                <Form.Label>
                    Email Address: 
                </Form.Label>
                <Form.Control
                    type='email'
                    placeholder='enter email'
                />
                <Form.Text className='text-muted'>
                    some text
                </Form.Text>
                <Form.Range min={10} max={100}/>
                <Form.Check 
                    type="switch"
                    id="custom-switch"
                    label="Check this switch"
                />
                <Form.Label>checkbox 
                </Form.Label>
                <Form.Check type= 'checkbox'/>
            </Form.Group>
        </Form>
    </>
  )
}

export default MainComponent