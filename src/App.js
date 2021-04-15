import logo from './logo.svg';

import "./App.css";

// import Greet from './components/Greet'
// import MyGreet from './components/Greet'
// import { Greet } from './components/Greet'
// import Welcome from './components/Welcome'
// import Hello from './components/Hello'
// import GreetProps from './components/GreetProps'
// import WelcomeProps from './components/WelcomeProps'
// import Message from './components/Message'
// import Counter from './components/Counter'
// import GreetDestructureProps from './components/GreetDestructureProps'
// import WelcomeDestructureProps from './components/WelcomeDestructureProps'
// import FunctionClick from './components/FunctionClick'
// import ClassClick from './components/ClassClick'
// import EventBind from './components/EventBind'
// import ParentComponent from './components/ParentComponent'
// import UserGreeting from './components/UserGreeting'
// import NameList from './components/NameList'
// import StyleSheet from './components/StyleSheet'
// import FragmentDemo from './components/FragmentDemo';
// import Header from './materialUI/Header';
// import MyMuiButton from './materialUI/MyMuiButton';
import Practice from './practice/Practice';

function App() {
  return (
    <div className="App">
      {/* <Greet /> */}
      {/* <MyGreet /> */}
      {/* <Welcome /> */}
      {/* <Hello /> */}

      {/* <GreetProps name="Ankan" heroname="Batman" >
        <p>This is children Props</p>
      </GreetProps>
      <GreetProps name="Ram" heroname="Superman" >
        <button>Action</button>
      </GreetProps>
      <GreetProps name="Sham" heroname="Wonder Woman" /> */}

      {/* <WelcomeProps heroname="Ankan" name="Batman"></WelcomeProps>
      <WelcomeProps heroname="Ram" name="Superman"></WelcomeProps>
      <WelcomeProps heroname="Sham" name="Wonder Woman"></WelcomeProps> */}


      {/* <Message /> */}

      {/* <Counter></Counter> */}

      {/* <GreetDestructureProps name="Ram" heroname="Superman" />
      <GreetDestructureProps name="Sham" heroname="Wonder Woman" />
      <GreetDestructureProps name="Ankan" heroname="Batman" /> */}

      {/* <WelcomeDestructureProps name="Ram" heroname="Superman" />
      <WelcomeDestructureProps name="Ankan" heroname="Batman" />
      <WelcomeDestructureProps name="Sham" heroname="Wonder Woman" /> */}

      {/* <FunctionClick></FunctionClick> */}
      {/* <ClassClick></ClassClick> */}

      {/* <EventBind></EventBind> */}

      {/* <ParentComponent></ParentComponent> */}

      {/* <UserGreeting></UserGreeting> */}

      {/* <NameList></NameList> */}

      {/* <StyleSheet></StyleSheet> */}

      {/* <FragmentDemo></FragmentDemo> */}

      {/* <Header></Header> */}

      {/* <MyMuiButton></MyMuiButton> */}

      <Practice></Practice>
    </div>
  );
}

export default App;








































// import React, { useEffect, useState } from "react";
// import Table from "@material-ui/core/Table";
// import TableBody from "@material-ui/core/TableBody";
// import TableCell from "@material-ui/core/TableCell";
// import TableHead from "@material-ui/core/TableHead";
// import TableRow from "@material-ui/core/TableRow";
// import InfiniteScroll from "react-infinite-scroll-component";
// import { CircularProgress } from "@material-ui/core";

// function App() {
//   const [data, setData] = useState([]);
//   const [hasMore, setHasMore] = useState(false);
//   const [count, setCount] = useState(20);
//   const [page, setPage] = useState(1);

//   useEffect(() => {
//     const getData = async () => {
//       console.log("IN GET DATA");
//       await fetch(`https://picsum.photos/v2/list?page=${page}&limit=${count}`)
//         .then((res) => res.json())
//         .then((data) => {
//           setData((prev) => [...prev, ...data]);
//           setHasMore(true);
//         })
//         .catch((err) => console.log(err));
//     };
//     getData();
//   }, [count, page]);

//   const fetchMoreData = () => {
//     console.log("INSIDE FETCHDATA");
//     setPage(page + 1);
//   };

//   console.log(data);
//   console.log("Page", page);

//   return (
//     <div id="scrollableDiv" className="app">
//       <InfiniteScroll
//         dataLength={data.length}
//         scrollableTarget="scrollableDiv"
//         next={fetchMoreData}
//         hasMore={hasMore}
//         loader={
//           <div
//             style={{
//               textAlign: "center",
//               marginTop: "10px",
//               marginBottom: "10px",
//             }}
//           >
//             <CircularProgress color="secondary" style={{ fontSize: "10px" }} />
//           </div>
//         }
//       >
//         <Table>
//           <TableHead>
//             <TableRow>
//               <TableCell align="left">ID </TableCell>
//               <TableCell align="left">Author </TableCell>
//               <TableCell align="left">Width</TableCell>
//               <TableCell align="left">Height</TableCell>
//               <TableCell align="left">IMG</TableCell>
//               <TableCell align="left">Download Link</TableCell>
//             </TableRow>
//           </TableHead>
//           <TableBody>
//             {data?.map((row, i) => (
//               <TableRow key={i}>
//                 <TableCell align="left">{row.id}</TableCell>
//                 <TableCell align="left">{row.author}</TableCell>
//                 <TableCell align="left">{row.width}</TableCell>
//                 <TableCell align="left">{row.height}</TableCell>
//                 <TableCell align="left">{row.url}</TableCell>
//                 <TableCell align="left">
//                   <img
//                     src={row.download_url}
//                     alt={"Image here"}
//                     style={{ height: "100px", width: "100px" }}
//                   />
//                 </TableCell>
//               </TableRow>
//             ))}
//           </TableBody>
//         </Table>
//       </InfiniteScroll>
//     </div>
//   );
// }

// export default App;
