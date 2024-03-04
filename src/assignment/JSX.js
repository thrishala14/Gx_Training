// Assignment 1: JSX
// Task:
// Create a simple React component that renders a paragraph with some text. Use JSX syntax to define the component.
// Requirements:
// • Use at least two HTML tags within the JSX.
// • Include a class or ID attribute in one of the HTML tags.
// • Render the component in the root element of your React application.

const JSX = (props) => {
  return (
    <div>
      <p className = "jsx">
        Everyone knows that paper is made from trees. But when one looks at
        trees, one cannot imagine that something so soft and fragile as the
        paper is made is so hard and strong. Plant materials such as wood are
        made of fibres known as cellulose. It is the primary ingredient in paper
        making. 
      </p>
      <p>
        Raw wood is first converted into pulp consisting of a mixture of
        Cellulose, lignin, water and some chemicals. The pulp can be made
        mechanically through grinders or through chemical processes. Short
        fibres are produced by mechanical grinding. The paper produced in this
        way is weak and is used to make newspapers, magazines and phonebooks.
      </p>
    </div>
  );
};

export default JSX
