import { useEffect, useState } from "react";

function Home(){
    const[products, setProducts] = useState([]); //Reacti erikood --> muutuja (HTMLi), funktsioon (HTMLi uuendamiseks), algväärtus (tühi massiiv)

    useEffect(()=>{
        fetch("http://localhost:8080/products").then(response => response.json())
    .then(body => setProducts(body));
    },[]);  //useEffect -->reacti erikood
    

    return (
        products.map (element =>
            <div>
                <img src={element.imgSrc} alt="" />
            <div>{element.name}</div>
            <div>{element.price}</div>
            <div>{element.id}</div>
            <div>{element.active}</div>
            <div>{element.description}</div>

                </div>)
            
       /* [{name: "Toode 1", price: 12}, {name: "Toode 2", price: 32}].map ( element => 
        <div>
            <div>{element.name}</div>
            <div>{element.price}</div>
                </div>)*/
    )
}

export default Home;