import React from 'react'
import Binding from './Binding'
import ClassClick from './ClassClick'
// import Counter from './Counter'
import DestructuringC from './DestructuringC'
import DestructuringFn from './DestructuringFn'
import FunctionClick from './FunctionClick'
import Message from './Message'
import ParentComponent from './ParentComponent'
import ConditionalRendering from './ConditionalRendering'
import List from './List'
import MyStyleItem from './MyStyleItem'
import InlineStyle from './InlineStyle'
import Form from './Form'
import LifecycleA from './LifecycleA'
import Fragmentdemo from './Fragmentdemo'
import Table from './Table'
import ParentRegularComponent from './ParentRegularComponent'
import RefsDemo from './RefsDemo'
import Input from './Input'
import FocusInput from './FocusInput'
import Heros from './Heros'
import ErrorBoundary from './ErrorBoundary'
// import ClickCounter from './HOC/ClickCounter'
// import HoverCounter from './HOC/HoverCounter'

import Counter from './RenderProps/Counter'
import ClickCounter from './RenderProps/ClickCounter'
import HoverCounter from './RenderProps/HoverCounter'
import User from './RenderProps/User'
import PostList from './HTTP/PostList'
import PostRequest from './HTTP/PostRequest'
import HookCounter from './HOOKS/HookCounter'
import HookCounterTwo from './HOOKS/HookCounterTwo'
import HookCounterThree from './HOOKS/HookCounterThree'
import HookCounterFour from './HOOKS/HookCounterFour'
import EffectCounter1 from './HOOKS/EffectCounter1'
import EffectCounter2 from './HOOKS/EffectCounter2'
import HookMouse from './HOOKS/HookMouse'
import MouseContainer from './HOOKS/MouseContainer'
import GET_Api from './HOOKS/GET_Api'
import GET_ApiParameter from './HOOKS/GET_ApiParameter'
import GET_ApiParameterButtonClick from './HOOKS/GET_ApiParameterButtonClick'
import Parent from './HOOKS/USE_CALLBACK/Parent'
import UsememoCounter from './HOOKS/UsememoCounter'
import UseRefFocus from './HOOKS/UseRefFocus'

function Practice() {
    return (
        <div>
            {/* <Message></Message> */}
            {/* <Counter></Counter> */}
            {/* <DestructuringFn name="Ankan" title="Mukherjee"></DestructuringFn>
            <DestructuringFn name="Ankan1" title="Mukherjee1"></DestructuringFn>
            <DestructuringFn name="Ankan2" title="Mukherjee2"></DestructuringFn> */}

            {/* <DestructuringC name="Ankan" title="Mukherjee"></DestructuringC>
            <DestructuringC name="Ankan1" title="Mukherjee1"></DestructuringC>
            <DestructuringC name="Ankan2" title="Mukherjee2"></DestructuringC> */}

            {/* <FunctionClick></FunctionClick> */}
            {/* <ClassClick /> */}
            {/* <Binding /> */}

            {/* <ParentComponent></ParentComponent> */}
            {/* <ConditionalRendering></ConditionalRendering> */}
            {/* <List></List> */}
            {/* <MyStyleItem isStyle={true}></MyStyleItem> */}
            {/* <InlineStyle></InlineStyle> */}
            {/* <Form></Form> */}
            {/* <LifecycleA></LifecycleA> */}

            {/* <Fragmentdemo></Fragmentdemo> */}
            {/* <Table></Table> */}
            {/* <ParentRegularComponent></ParentRegularComponent> */}
            {/* <RefsDemo></RefsDemo> */}
            {/* <FocusInput></FocusInput> */}

            {/* <ErrorBoundary>
                <Heros heroname="Batman"></Heros>
            </ErrorBoundary>
            <ErrorBoundary>
                <Heros heroname="Superman"></Heros>
            </ErrorBoundary>
            <ErrorBoundary>
                <Heros heroname="Jocker"></Heros>
            </ErrorBoundary> */}

            {/* <ClickCounter name="Ankan"></ClickCounter>
            <HoverCounter></HoverCounter> */}

            {/* <ClickCounter ></ClickCounter>
            <HoverCounter></HoverCounter>
            <User myRenderProp={(isLoggedIn) => isLoggedIn ? "Ankan" : "Guest"}></User> */}

            {/* <Counter render={(count, increamentCount) => (
                <ClickCounter count={count} increamentCount={increamentCount} />
            )} />

            <Counter render={(count, increamentCount) => (
                <HoverCounter count={count} increamentCount={increamentCount} />
            )} /> */}

            {/* <PostList /> */}
            {/* <PostRequest /> */}

            {/* <HookCounter /> */}
            {/* <HookCounterTwo /> */}
            {/* <HookCounterThree /> */}
            {/* <HookCounterFour /> */}
            {/* <EffectCounter1 /> */}
            {/* <EffectCounter2 /> */}
            {/* <HookMouse /> */}
            {/* <MouseContainer /> */}
            {/* <GET_Api /> */}
            {/* <GET_ApiParameter /> */}
            {/* <GET_ApiParameterButtonClick /> */}
            {/* <Parent/> */}
            {/* <UsememoCounter /> */}
            <UseRefFocus />

        </div>
    );
}
export default Practice
