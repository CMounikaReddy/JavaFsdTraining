import React, { useState, useEffect } from "react";

const UseEffectExample = () => {
  const [button, setButton] = useState("");

  //useEffect hook
  useEffect(() => {
    console.log("useEffect has been called component update!", button);
  });


  useEffect(() => {
    console.log("useEffect has been called component mount!", button);
  },[]);


  useEffect(() => {
    return () => {
            console.log(" will mount removed from the DOM.");
        }
  }, []);



  const onYesPress = () => {
    setButton("Yes");
  };

  const onNoPress = () => {
    setButton("No");
  };

return (
      <div>
        <button onClick={() => onYesPress()}>Yes</button>
        <button onClick={() => onNoPress()}>No</button>
      </div>
    );
};

export default UseEffectExample;
  