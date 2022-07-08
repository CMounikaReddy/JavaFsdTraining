
import E,{ Form } from './Employee';

function Welcome() {

    const emplist = [
        { id: 1, empname: "Mounika", status: "P" },
        { id: 2, empname: "Taehyung", status: "P" },
        { id: 3, empname: "Jungkook", status: "P" }
      ];

    return (
        <div>
            <h2>New Applications</h2>
            <a href="createOrder">Create Order</a><br></br>
            <a href="createProduct">Create Product</a><br></br>
            <a href="createCustomer">Create Customer</a><br></br>
            <E e={emplist} />
            <Form />
        </div>

    );

}

