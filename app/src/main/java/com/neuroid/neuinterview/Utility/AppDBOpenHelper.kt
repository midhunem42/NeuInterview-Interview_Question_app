package com.neuroid.neuinterview.Utility

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import com.neuroid.neuinterview.model.Question

class AppDBOpenHelper (context: Context,
                       factory: SQLiteDatabase.CursorFactory?) :
    SQLiteOpenHelper(context, DATABASE_NAME,
        factory, DATABASE_VERSION) {

    var dbLocal: SQLiteDatabase? = null
    override fun onCreate(db: SQLiteDatabase) {
        dbLocal = db
        val CREATE_PRODUCTS_TABLE = ("CREATE TABLE  " +
                TABLE_NAME + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY," +
                COLUMN_category+ " TEXT," +
                COLUMN_answer + " TEXT," + COLUMN_question + " TEXT" +
                ")")
        db.execSQL(CREATE_PRODUCTS_TABLE)
        GenerateQuestionFunction()
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        Log.e("TAG", "Updating table from " + oldVersion + " to " + newVersion)
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME)
        onCreate(db)
    }

    override fun onDowngrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME)
        onCreate(db)
    }

    private fun GenerateQuestionFunction() {
        AngularQuestions()
        HtmlQuestions()
        CSSQuestions()
        BootstrapQuestions()
        JavaScriptQuestions()
        jQueryQuestions()
        TypScriptQuestions()
        NodeJSQuestions()
        ES6Questions()
        ReactJSQuestions()
        MongoDBQuestions()
    }

    private fun MongoDBQuestions() {
        addQuestion(Question(1,"MongoDB","What is MongoDB?","Mongo-DB is a document database which provides high performance, high availability and easy scalability.\n" +
                "\n"))
        addQuestion(Question(2,"MongoDB","What is “Namespace” in MongoDB?","MongoDB stores BSON (Binary Interchange and Structure Object Notation) objects in the collection. The concatenation of the collection name and database name is called a namespace."))
        addQuestion(Question(3,"MongoDB","What is sharding in MongoDB?","The procedure of storing data records across multiple machines is referred as Sharding. It is a MongoDB approach to meet the demands of data growth. It is the horizontal partition of data in a database or search engine. Each partition is referred as shard or database shard.\n" +
                "\n"))
        addQuestion(Question(4,"MongoDB","How can you see the connection used by Mongos?","To see the connection used by Mongos use db_adminCommand (“connPoolStats”);\n" +
                "\n"))
        addQuestion(Question(5,"MongoDB","Explain what is a replica set?","A replica set is a group of mongo instances that host the same data set. In replica set, one node is primary, and another is secondary. From primary to the secondary node all data replicates.\n" +
                "\n"))
        addQuestion(Question(6,"MongoDB","How replication works in MongoDB?","Across multiple servers, the process of synchronizing data is known as replication. It provides redundancy and increase data availability with multiple copies of data on different database server. Replication helps in protecting the database from the loss of a single server.\n" +
                "\n"))
        addQuestion(Question(7,"MongoDB","While creating Schema in MongoDB what are the points need to be taken in consideration?","Points need to be taken in consideration are\n" +
                "\n" +
                "Design your schema according to user requirements\n" +
                "Combine objects into one document if you use them together. Otherwise, separate them\n" +
                "Do joins while write, and not when it is on read\n" +
                "For most frequent use cases optimize your schema\n" +
                "Do complex aggregation in the schema\n"))
        addQuestion(Question(8,"MongoDB","Explain what is the role of profiler in MongoDB?","MongoDB database profiler shows performance characteristics of each operation against the database. You can find queries using the profiler that are slower than they should be.\n" +
                "\n"))
        addQuestion(Question(9,"MongoDB"," To do safe backups what is the feature in MongoDB that you can use?","Journaling is the feature in MongoDB that you can use to do safe backups.\n" +
                "\n"))
        addQuestion(Question(10,"MongoDB","Mention what is Objecld composed of?","Objectld is composed of\n" +
                "\n" +
                "*)\tTimestamp\n" +
                "*)\tClient machine ID\n" +
                "*)\tClient process ID\n" +
                "*)\t3 byte incremented counter"))


    }

    private fun ReactJSQuestions() {
        addQuestion(Question(1,"ReactJS","What is ReactJS","React is an open-source frontend JavaScript library which is used for building user interfaces especially for single page applications. It is used for handling view layer for web and mobile apps. React was created by Jordan Walke, a software engineer working for Facebook. React was first deployed on Facebook's News Feed in 2011 and on Instagram in 2012."))
        addQuestion(Question(2,"ReactJS","What are the major features of React","The major features of React are:\n" +
                "\n" +
                "\n*)\tIt uses VirtualDOM instead RealDOM considering that RealDOM manipulations are expensive.\n" +
                "\n" +
                "*)\tSupports server-side rendering.\n" +
                "\n" +
                "*)\tFollows Unidirectional* data flow or data binding.\n" +
                "\n" +
                "*)\tUses reusable/composable UI components to develop the view."))
        addQuestion(Question(3,"ReactJS","What is JSX?","JSX is a XML-like syntax extension to ECMAScript (the acronym stands for JavaScript XML). Basically it just provides syntactic sugar for the React.createElement() function, giving us expressiveness of JavaScript along with HTML like template syntax."))
        addQuestion(Question(4,"ReactJS","What is the difference between Element and Component?","An Element is a plain object describing what you want to appear on the screen in terms of the DOM nodes or other components. Elements can contain other Elements in their props. Creating a React element is cheap. Once an element is created, it is never mutated."))
        addQuestion(Question(5,"ReactJS","When to use a Class Component over a Function Component?","If the component needs state or lifecycle methods then use class component otherwise use function component.\n" +
                "\n"))
        addQuestion(Question(6,"ReactJS","What are Pure Components?","React.PureComponent is exactly the same as React.Component except that it handles the shouldComponentUpdate() method for you. When props or state changes, PureComponent will do a shallow comparison on both props and state. Component on the other hand won't compare current props and state to next out of the box. Thus, the component will re-render by default whenever shouldComponentUpdate is called."))
        addQuestion(Question(7,"ReactJS","What is the difference between state and props?","Both props and state are plain JavaScript objects. While both of them hold information that influences the output of render, they are different in their functionality with respect to component. Props get passed to the component similar to function parameters whereas state is managed within the component similar to variables declared within a function."))
        addQuestion(Question(8,"ReactJS","What is the purpose of callback function as an argument of setState()?","The callback function is invoked when setState finished and the component gets rendered. Since setState() is asynchronous the callback function is used for any post action.\n" +
                "\n" +
                "Note: It is recommended to use lifecycle method rather than this callback function.\n" +
                "\n" +
                "setState({ name: 'John' }, () => console.log('The name has updated and component re-rendered'))"))
        addQuestion(Question(9,"ReactJS","How to pass a parameter to an event handler or callback?","You can use an arrow function to wrap around an event handler and pass parameters:\n" +
                "\n" +
                "<button onClick={() => this.handleClick(id)} />\n" +
                "This is an equivalent to calling .bind:\n" +
                "\n" +
                "<button onClick={this.handleClick.bind(this, id)} />\n>"))
        addQuestion(Question(10,"ReactJS","What are synthetic events in React?","SyntheticEvent is a cross-browser wrapper around the browser's native event. It's API is same as the browser's native event, including stopPropagation() and preventDefault(), except the events work identically across all browsers."))

    }
    private fun ES6Questions() {
        addQuestion(Question(1,"ES6","What are the Navigator-specific methods used in ES6?","javaEnabled()\n" +
                " \n" +
                "taintEnabled()\n" +
                " \n" +
                "plugings.refresh\n" +
                " \n" +
                "preference(name,value)"))
        addQuestion(Question(2,"ES6","What is the use of pop() method?","What is the use of pop() method?"))
        addQuestion(Question(3,"ES6","What is Callback?","Callback: In Callback, A function may be passed as a parameter to another function.\n" +
                "\n"))
        addQuestion(Question(4,"ES6","What is Alert Dialog Box?","It is used to send a warning message to the users and provides only one button “OK” to select and proceed.\n" +
                "\n"))
        addQuestion(Question(5,"ES6","What is the syntax used for creating a number object?","var val = new Number(number);\n"))
        addQuestion(Question(6,"ES6","What is location.replace()?","It is the replace() method of window.location object which is used to replace the current document with a new one."))
        addQuestion(Question(7,"ES6","Who is the inventor of ES6?","Designed by Brendan Eich.\n" +
                "\n"))
        addQuestion(Question(8,"ES6"," How to export a single value or element in a Module?","By using export default element_name\n" +
                "\n"))
        addQuestion(Question(9,"ES6","How to export multiple values or elements in a Module?","By using export {element_name1,element_name2,….}\n" +
                "\n"))
        addQuestion(Question(10,"ES6","What are the predefined types of Error Objects available in ES6?","\n*)\tURIError\n" +
                "\n" +
                "*)\tEvalError\n" +
                "\n" +
                "*)\tTypeError\n" +
                "\n" +
                "*)\tRangeError\n" +
                "\n" +
                "*)\tSyntaxError\n" +
                "\n" +
                "*)\tReferenceError\n"))

    }
    private fun NodeJSQuestions() {
        addQuestion(Question(1,"NodeJS","Why code written in Node.JS is pretty fast although being written in JavaScript?","Being built on Google Chrome's V8 JavaScript Engine, Node.js library is very fast in code execution."))
        addQuestion(Question(2,"NodeJS","Which is the command to show version of Node?","node --version"))
        addQuestion(Question(3,"NodeJS","net.isIP(input) returns 4 for IP version 4 addresses.","net.isIP(input) tests if input is an IP address. Returns 0 for invalid strings, returns 4 for IP version 4 addresses, and returns 6 for IP version 6 addresses." +
                "\n"))
        addQuestion(Question(4,"NodeJS","Which method of fs module is used to read a file?","fs.read(fd, buffer, offset, length, position, callback)"))
        addQuestion(Question(5,"NodeJS","Which method of fs module is used to remove a directory?","fs.rmdir(path, callback)"))
        addQuestion(Question(6,"NodeJS","Can we create child processes in Node applications.","Node facilitates creation of child processes to leverage parallel processing on multi-core cpu based systems."))
        addQuestion(Question(7,"NodeJS","What does event-driven programming mean?","In computer programming, event driven programming is a programming paradigm in which the flow of the program is determined by events like messages from other programs or threads. It is an application architecture technique divided into two sections \n\n1)\t Event Selection \n\n2)\t Event Handling"))
        addQuestion(Question(8,"NodeJS"," What is control flow function?"," What is control flow function?"))
        addQuestion(Question(9,"NodeJS","Why Node.js is single threaded?","For async processing, Node.js was created explicitly as an experiment. It is believed that more performance and scalability can be achieved by doing async processing on a single thread under typical web loads than the typical thread based implementation.\n" +
                "\n"))
        addQuestion(Question(10,"NodeJS","Can you access DOM in node?","No, you cannot access DOM in node.\n" +
                "\n"))

    }

    private fun TypScriptQuestions() {
        addQuestion(Question(1,"TypScript","What is Type assertions in TypeScript?","A type assertion is like a type cast in other languages, but performs no special checking or restructuring of data. It has no runtime impact, and is used purely by the compiler. TypeScript assumes that we have performed any special checks that we need"))
        addQuestion(Question(2,"TypScript","What is as syntax in TypeScript?","The as is additional syntax for Type assertion in TypeScript. The reason for introducing the as-syntax is that the original syntax (<type>) conflicted with JSX."))
        addQuestion(Question(3,"TypScript","What is Compilation Context?","The compilation context is basically grouping of the files that TypeScript will parse and analyze to determine what is valid and what isn’t. Along with the information about which files, the compilation context contains information about which compiler options. A great way to define this logical grouping is using a tsconfig.json file."))
        addQuestion(Question(4,"TypScript","Can an interface extends a class just like a classimplements interface?","Yes, an interface extends a class, when it does it inherits the members of the class but not their implementations. Interfaces inherit even the private and protected members of a base class. This means that when you create an interface that extends a class with private or protected members, that interface type can only be implemented by that class or a subclass of it.\n" +
                "\n"))
        addQuestion(Question(5,"TypScript","What are all the other access modifiers that TypeScript supports?","TypeScript supports access modifiers public, private and protected which determine the accessibility of a class member as given below:\n" +
                "\n" +
                "*\tpublic - All the members of the class, its child classes, and the instance of the class can access.\n" +
                "*\tprotected - All the members of the class and its child classes can access them. But the instance of the class can not access.\n" +
                "*\tprivate - Only the members of the class can access them."))
        addQuestion(Question(6,"TypScript","What is Generic Class?","A generic class has a similar shape to a generic interface. Generic classes have a generic type parameter list in angle brackets (<>) following the name of the class"))
        addQuestion(Question(7,"TypScript","What is JSX? Can we use JSX in TypeScript?t","JSX is an embeddable XML-like syntax. It is meant to be transformed into valid JavaScript. JSX came to popularity with the React framework. TypeScript supports embedding, type checking, and compiling JSX directly into JavaScript.\n" +
                "\n" +
                "In order to use JSX in our file: we must name our file with a .tsx extension and should enable jsx option."))
        addQuestion(Question(8,"TypScript"," What are all the JSX modes TypeScript supports?","TypeScript ships with three JSX modes: preserve, react, and react-native.\n" +
                "\n" +
                "The preserve mode will keep the JSX as part of the output to be further consumed by another transform step (e.g. Babel). Additionally the output will have a .jsx file extension. The react mode will emit React.createElement, does not need to go through a JSX transformation before use, and the output will have a .js file extension. The react-native mode is the equivalent of preserve in that it keeps all JSX, but the output will instead have a .js file extension."))
        addQuestion(Question(9,"TypScript","Why TypeScript is referred as Optionally Statically Typed Language?" +
                "\n","TypeScript is referred as optionally statically typed, which means we can make the compiler to ignore the type of a variable optionally. Using any data type, we can assign any type of value to the variable. TypeScript will not give any error checking during compilation."))
        addQuestion(Question(10,"TypScript"," What is TypeScript? Why should we use it?","TypeScript is a typed superset of JavaScript that compiles to plain JavaScript which runs on any browser or JavaScript engine.\n" +
                "\n"))
    }

    private fun jQueryQuestions() {
        addQuestion(Question(1,"jQuery","What is jQuery","jQuery is a fast and concise JavaScript Library created by John Resig in 2006 with a nice motto - Write less, do more. jQuery simplifies HTML document traversing, event handling, animating, and Ajax interactions for rapid web development. jQuery is a JavaScript toolkit designed to simplify various tasks by writing less code.>"))
        addQuestion(Question(2,"jQuery","What are the core features of jQuery?","DOM manipulation − The jQuery made it easy to select DOM elements, traverse them and modifying their content by using cross-browser open source selector engine called Sizzle.\n" +
                "\n" +
                "*)\tEvent handling − The jQuery offers an elegant way to capture a wide variety of events, such as a user clicking on a link, without the need to clutter the HTML code itself with event handlers.\n" +
                "\n" +
                "*)\tAJAX Support − The jQuery helps you a lot to develop a responsive and feature-rich site using AJAX technology.\n" +
                "\n" +
                "*)\tAnimations − The jQuery comes with plenty of built-in animation effects which you can use in your websites.\n" +
                "\n" +
                "*)\tLightweight − The jQuery is very lightweight library - about 19KB in size ( Minified and gzipped ).\n" +
                "\n" +
                "*)\tCross Browser Support − The jQuery has cross-browser support, and works well in IE 6.0+, FF 2.0+, Safari 3.0+, Chrome and Opera 9.0+.\n" +
                "\n" +
                "Latest Technology − The jQuery supports CSS3 selectors and basic XPath syntax."))
        addQuestion(Question(3,"jQuery","How will you make sure that DOM is ready using jQuery?","Use \$(document).ready() function. Everything inside it will load as soon as the DOM is loaded and before the page contents are loaded.\n" +
                "\n"))
        addQuestion(Question(4,"jQuery","How can you create an Object in JavaScript?y","JavaScript supports Object concept very well. You can create an object using the object literal as follows −\n" +
                "\n" +
                "var emp = {\n" +
                "   name: \"Zara\",\n" +
                "   age: 10\n" +
                "};"))
        addQuestion(Question(5,"jQuery","Can you assign a anonymous function to a variable?\n","Yes! An anonymous function can be assigned to a variable.\n" +
                "\n"))
        addQuestion(Question(6,"jQuery","What is arguments object in JavaScript?","JavaScript variable arguments represents the arguments passed to a function.\n" +
                "\n"))
        addQuestion(Question(7,"jQuery","What is the purpose of 'this' operator in JavaScript?","JavaScript famous keyword this always refers to the current context.\n" +
                "\n"))
        addQuestion(Question(8,"jQuery","What is callback?","A callback is a plain JavaScript function passed to some method as an argument or option. Some callbacks are just events, called to give the user a chance to react when a certain state is triggered.\n" +
                "\n"))
        addQuestion(Question(9,"jQuery","What is closure?","Closures are created whenever a variable that is defined outside the current scope is accessed from within some inner scope.\n" +
                "\n"))
        addQuestion(Question(10,"jQuery","Which built-in method returns the length of the string?","length() method returns the length of the string.\n" +
                "\n"))
    }
    private fun HtmlQuestions() {
        addQuestion(Question(1,"HTML5","What is Html5","HTML5 is the latest version of HTML and XHTML with new features like Drawing, Animation, Video and Audio etc. It is used to solve some common structural problems encountered with HTML 4.1. It gives more flexibility to both the web developers, the web designers and enables more exciting and interactive websites in addition to more powerful and efficient applications. The HTML 5 <! doctype html> is recognized by all modern browsers.\n" +
                "\n\n" +
                "HTML5 brings a whole new dimension to the web world. It can embed video on the web-pages without using any special software like Flash. HTML5 is developed in such a way that the developers are not required to waste their time and efforts in creating an error free web page. Firefox, Chrome, Opera, Safari and Internet Explorer all support <! doctype html>."))

        addQuestion(Question(2,"HTML5","Why do we use HTML5?l","The main benefit of HTML5 is that it supports Drawing, Animation, Video and Audio.\n" +
                "\n\n" +
                "The web developers can decrease the complexity and the time to create applications with animations, play music (audio and video), high quality drawings and other rich content using HTML 5 because it can embed video on the web-pages without using any special software like Flash.\n" +
                "\n\n" +
                "HTML5 is far easier for the web designers and the web developers as it tells them how a web page is structured."))
        addQuestion(Question(3,"HTML5","What is DataList Tag in HTML?","A <datalist> tag can be used to create a simple auto-complete feature for a webpage.<datalist> is a newly defined HTML tag that comes with the HTML 5 specification. By using this <datalist> tag, we can define a list of data and then we can bind it with an <input> tag. \n" +
                "\n\n" +
                "A <datalist> tag specifies a list of predefined options for an <input> element. After binding it, the user will see a drop down list in which all the predefined options will be there for the input. When the user types a character or a string, the user will automatically get the data which depends on the input string or a character."))
        addQuestion(Question(4,"HTML5","What is the use of Drag and Drop in HTML5?","Drag and drop is a very common feature and convenient to users. Simply, you need to grab an object and put it at the place you want. This feature is commonly used by many of the online examination websites wherein you have the options to pick up the correct answer, drag it to the answers place holder and drop it."))
        addQuestion(Question(5,"HTML5","What is HTML 5 Web Storage?","HTML5 Web Storage, also known as DOM Storage is a way to preserve state on either the client or server which makes it much easier to work against the stateless nature of HTTP."))
        addQuestion(Question(6,"HTML5","Advantages of HTML5 Web Storage?","1)\tIt can store 5 to 10 MB data. That is far more than what cookies have.\n\n" +
                "2)\tWeb storage data is never transferred with HTTP request, so it increases the performance of the application."))
        addQuestion(Question(7,"HTML5","Web Storage Strengths and Weaknesses ?","Strengths\n" +
                "\n" +
                "\n\tApps can work both online and offline.\n" +
                "\n" +
                "\tAPI is easy to learn and use.\n" +
                "\n" +
                "\tHas the ability to hook in to the browser events such as offline, online and storage change.\n" +
                "\n" +
                "\tHas less overhead than cookies; no extra header data is sent with the browser requests.\n" +
                "\n" +
                "\tProvides more space than what cookies offer so increasingly complex information can be kept.\n" +
                "Weaknesses\n" +
                "\n" +
                "\n" +
                "\tData is stored as a simple string; manipulation is needed to store objects of different types such as Booleans, Objects, Ints and Floats.\n" +
                "\n" +
                "\tIt has a default 5MB limit; more storage can be allowed by the user, if required.\n" +
                "\n" +
                "\tIt can be disabled by the user or systems administrator.\n" +
                "\n" +
                "\tStorage can be slow with the complex sets of data."))
        addQuestion(Question(8,"HTML5","What are the types of Web Storage in HTML5?","There are two types of Web Storage,\n" +
                " \n" +
                "\n" +
                "1)\tSession Storage\n\n" +
                "2)\tLocal Storage"))
        addQuestion(Question(9,"HTML5"," What is Audio Tag in HTML 5?","This new element allows you to deliver audio files directly through the browser, without the need for any plug-ins. The Audio tag is a new tag introduced in HTML5. You can use it to play audio sound like .mp3, wav, and .ogg. I have used five types of sound formats to show which formats are compatible for the browsers. A WAV file is a common sound format that is supported by most browser versions.\n" +
                "\n" +
                "Syntax\n\n" +
                "\n" +
                "<audio src=\"URL\" controls> </audio>"))
        addQuestion(Question(10,"HTML5","What are the features of HTML5 Canvas? ","Flexibility\n" +
                "Interactivity\n\n" +
                "Multimedia Options\n\n" +
                "Animation\n\n" +
                "Platform Support\n\n" +
                "Free and Accessible Dev Tools\n\n" +
                "Code Once, Run Everywhere"))
        addQuestion(Question(11,"HTML5","What is the use of Fieldset tag in HTML5?","The <fieldset> tag groups related form elements. It is like a box. In other words, it draws a box around related elements.\n" +
                "\n" +
                "It must start with a <legend>tag because the <legend> tag defines the title of the field set.\n" +
                "\n\n" +
                "By using the <fieldset>tag and the <legend> tag, you can make your form much easier to understand for the users.\n" +
                "\n" +
                "Syntax\n" +
                "\n\n" +
                "The syntax of the <fieldset> tag in HTML5 is:\n" +
                "\n\n" +
                "<fieldset>Controls</fieldset>"))
        addQuestion(Question(12,"HTML5","Which browsers support HTML5?","The latest versions of Apple Safari, Google Chrome, Mozilla Firefox, and Opera all support many HTML5 features and Internet Explorer 9.0 will also have support for some HTML5 functionality.\n" +
                "\n\n" +
                "The mobile web browsers that come pre-installed on iPhones, iPads, and Android phones all have excellent support for HTML5."))
        addQuestion(Question(13,"HTML5","Is HTML5 backward compatible with old browsers?","Yes! HTML5 is designed, as much as possible, to be backward compatible with existing web browsers. New features build on existing features and allow you to provide fallback content for older browsers.\n" +
                "\n\n" +
                "It is suggested to detect support for individual HTML5 features using a few lines of JavaScript.\n" +
                "\n"))
        addQuestion(Question(14,"HTML5","Are HTML tags case sensitive?","No!"))
        addQuestion(Question(15,"HTML5","What is the purpose of 'section' tag in HTML5?","This tag represents a generic document or application section. It can be used together with h1-h6 to indicate the document structure."))
        addQuestion(Question(16,"HTML5","What is the purpose of 'article' tag in HTML5?","This tag represents an independent piece of content of a document, such as a blog entry or newspaper article."))
        addQuestion(Question(17,"HTML5","What is the purpose of 'aside' tag in HTML5?","This tag represents a piece of content that is only slightly related to the rest of the page.\n" +
                "\n"))
        addQuestion(Question(18,"HTML5","What is the purpose of 'dialog' tag in HTML5?","This tag can be used to mark up a conversation.\n" +
                "\n"))
        addQuestion(Question(19,"HTML5","What is Web Forms 2.0?","Web Forms 2.0 is an extension to the forms features found in HTML4. Form elements and attributes in HTML5 provide a greater degree of semantic mark-up than HTML4 and remove a great deal of the need for tedious scripting and styling that was required in HTML4."))
        addQuestion(Question(20,"HTML5","What is the purpose of datetime-local input control in Web form 2.0?","It represents a date and time (year, month, day, hour, minute, second, fractions of a second) encoded according to ISO 8601 with no time zone information."))
        addQuestion(Question(21,"HTML5","What is the purpose of month input control in Web form 2.0?","It represents a date consisting of a year and a month encoded according to ISO 8601.\n" +
                "\n"))
        addQuestion(Question(22,"HTML5","What are the new Form elements made available in HTML5?\n\n","The new Form elements in HTML5 provide for a better functionality. The tags provided to carry out these functions are:\n" +
                "\n\n" +
                "1)\t <datalist> - It specifies a list of options for input controls. These options are pre-defined.\n\n" +
                "2)\t <keygen> - This tag defines a key-pair generator field.\n\n" +
                "3)\t <output> - It defines the result of a calculation."))
        addQuestion(Question(23,"HTML5","What is HTML5 Web Storage?","With HTML5, it is possible for the web pages to store the data locally in the user's browser. This web storage is much faster and secured than the cookies. Also, a larger amount of data can be stored without causing any adverse effect to the performance of the website.\n" +
                "\n\n" +
                "The data here is not included with every server request. It is used ONLY when it is asked for. It is only that particular web page that can access the data stored by itself."))
        addQuestion(Question(24,"HTML5","What is a Web Worker?","1.\tA web worker is a JavaScript which runs in the background. It exists in external files.\n" +
                "\n2.\tIt is independent of other scripts and does not affect the performance of the page.\n\n" +
                "3.\tWeb workers are usually used for CPU intensive tasks."))
        addQuestion(Question(25,"HTML5","Which JavaScript objects are not accessible to web worker?","Following JavaScript objects are not accessible to web worker:\n" +
                "\n\n" +
                "1.\t The window object\n\n" +
                "2.\t The document object\n\n" +
                "3.\t The parent object"))

    }
    private fun AngularQuestions(){
        addQuestion(Question(1,"Angular","What is Angular Framework?","Angular is a TypeScript-based open-source front-end platform that makes it easy to build applications with in web/mobile/desktop. The major features of this framework such as declarative templates, dependency injection, end to end tooling, and many more other features are used to ease the development."))
        addQuestion(Question(2,"Angular","What are the key components of Angular?","Angular has the below key components,\n" +
                "\n\n" +
                "Component: These are the basic building blocks of angular application to control HTML views.\n\n" +
                "1)\tModules: An angular module is set of angular basic building blocks like component, directives, services etc. An application is divided into logical pieces and each piece of code is called as \"module\" which perform a single task.\n\n" +
                "2)\tTemplates: This represent the views of an Angular application.\n\n" +
                "3)\tServices: It is used to create components which can be shared across the entire application.\n\n" +
                "4)\tMetadata: This can be used to add more data to an Angular class."))
        addQuestion(Question(3,"Angular","What are directives?","Directives add behaviour to an existing DOM element or an existing component instance.\n" +
                "\n\n" +
                "import { Directive, ElementRef, Input } from '@angular/core';\n\n" +
                "\n\n" +
                "@Directive({ selector: '[myHighlight]' })\n\n" +
                "export class HighlightDirective {\n\n" +
                "    constructor(el: ElementRef) {\n\n" +
                "       el.nativeElement.style.backgroundColor = 'yellow';\n\n" +
                "    }\n\n" +
                "}\n\n" +
                "Now this directive extends HTML element behavior with a yellow background as below\n" +
                "\n\n" +
                "<p myHighlight>Highlight me!</p>"))

        addQuestion(Question(4,"Angular","What are components?","Components are the most basic UI building block of an Angular app which formed a tree of Angular components. These components are subset of directives. Unlike directives, components always have a template and only one component can be instantiated per an element in a template. Let's see a simple example of Angular component\n" +
                "\n" +
                "import { Component } from '@angular/core';\n" +
                "\n" +
                "@Component ({\n" +
                "   selector: 'my-app',\n" +
                "   template: ` <div>\n" +
                "      <h1>{{title}}</h1>\n" +
                "      <div>Learn Angular6 with examples</div>\n" +
                "   </div> `,\n" +
                "})\n" +
                "\n" +
                "export class AppComponent {\n" +
                "   title: string = 'Welcome to Angular world';\n" +
                "}"))
        addQuestion(Question(5,"Angular","What is a template?","A template is a HTML view where you can display data by binding controls to properties of an Angular component. You can store your component's template in one of two places. You can define it inline using the template property, or you can define the template in a separate HTML file and link to it in the component metadata using the @Component decorator's templateUrl property. Using inline template with template syntax,\n" +
                "\n" +
                "import { Component } from '@angular/core';\n" +
                "\n" +
                "@Component ({\n" +
                "   selector: 'my-app',\n" +
                "   template: '\n" +
                "      <div>\n" +
                "         <h1>{{title}}</h1>\n" +
                "         <div>Learn Angular</div>\n" +
                "      </div>\n" +
                "   '\n" +
                "})\n" +
                "\n" +
                "export class AppComponent {\n" +
                "   title: string = 'Hello World';\n" +
                "}\n" +
                "Using separate template file such as app.component.html\n" +
                "\n" +
                "import { Component } from '@angular/core';\n" +
                "\n" +
                "@Component ({\n" +
                "   selector: 'my-app',\n" +
                "   templateUrl: 'app/app.component.html'\n" +
                "})\n" +
                "\n" +
                "export class AppComponent {\n" +
                "   title: string = 'Hello World';\n" +
                "}"))
        addQuestion(Question(6,"Angular","What is a module?","Modules are logical boundaries in your application and the application is divided into separate modules to separate the functionality of your application. Lets take an example of app.module.ts root module declared with @NgModule decorator as below,\n" +
                "\n" +
                "import { NgModule }      from '@angular/core';\n" +
                "import { BrowserModule } from '@angular/platform-browser';\n" +
                "import { AppComponent }  from './app.component';\n" +
                "\n" +
                "@NgModule ({\n" +
                "   imports:      [ BrowserModule ],\n" +
                "   declarations: [ AppComponent ],\n" +
                "   bootstrap:    [ AppComponent ]\n" +
                "})\n" +
                "export class AppModule { }\n" +
                "The NgModule decorator has three options\n" +
                "\n" +
                "The imports option is used to import other dependent modules. The BrowserModule is required by default for any web based angular application\n" +
                "The declarations option is used to define components in the respective module\n" +
                "The bootstrap option tells Angular which Component to bootstrap in the application"))
        addQuestion(Question(7,"Angular","What are lifecycle hooks available?","Angular application goes through an entire set of processes or has a lifecycle right from its initiation to the end of the application\n\n"+"The description of each lifecycle method is as below,\n" +
                "\n" +
                "1)\tngOnChanges: When the value of a data bound property changes, then this method is called.\n" +
                "2)\tngOnInit: This is called whenever the initialization of the directive/component after Angular first displays the data-bound properties happens.\n" +
                "3)\tngDoCheck: This is for the detection and to act on changes that Angular can't or won't detect on its own.\n" +
                "4)\tngAfterContentInit: This is called in response after Angular projects external content into the component's view.\n" +
                "5)\tngAfterContentChecked: This is called in response after Angular checks the content projected into the component.\n" +
                "6)\tngAfterViewInit: This is called in response after Angular initializes the component's views and child views.\n" +
                "7)\tngAfterViewChecked: This is called in response after Angular checks the component's views and child views.\n" +
                "8)\tngOnDestroy: This is the cleanup phase just before Angular destroys the directive/component."))
        addQuestion(Question(8,"Angular","What is a data binding?","Data binding is a core concept in Angular and allows to define communication between a component and the DOM, making it very easy to define interactive applications without worrying about pushing and pulling data. There are four forms of data binding(divided as 3 categories) which differ in the way the data is flowing.\n" +
                "\n" +
                "1)\tFrom the Component to the DOM: Interpolation: {{ value }}: Adds the value of a property from the component\n" +
                "<li>Name: {{ user.name }}</li>\n" +
                "<li>Address: {{ user.address }}</li>\n" +
                "Property binding: [property]=”value”: The value is passed from the component to the specified property or simple HTML attribute\n" +
                "\n\n" +
                "<input type=\"email\" [value]=\"user.email\">\n\n" +
                "2)\tFrom the DOM to the Component: Event binding: (event)=”function”: When a specific DOM event happens (eg.: click, change, keyup), call the specified method in the component\n" +
                "<button (click)=\"logout()\"></button>\n\n" +
                "3)\tTwo-way binding: Two-way data binding: [(ngModel)]=”value”: Two-way data binding allows to have the data flow both ways. For example, in the below code snippet, both the email DOM input and component email property are in sync\n" +
                "\n<input type=\"email\" [(ngModel)]=\"user.email\">"))
        addQuestion(Question(9,"Angular","What is dependency injection in Angular?","Dependency injection (DI), is an important application design pattern in which a class asks for dependencies from external sources rather than creating them itself. Angular comes with its own dependency injection framework for resolving dependencies( services or objects that a class needs to perform its function).So you can have your services depend on other services throughout your application."))
        addQuestion(Question(10,"Angular","What is the purpose of ngFor directive?","We use Angular ngFor directive in the template to display each item in the list. For example, here we iterate over list of users,\n" +
                "\n" +
                "<li *ngFor=\"let user of users\">\n" +
                "  {{ user }}\n" +
                "</li>\n" +
                "The user variable in the ngFor double-quoted instruction is a template input variable"))
        addQuestion(Question(11,"Angular","What happens if you use script tag inside template?","Angular recognizes the value as unsafe and automatically sanitizes it, which removes the <script> tag but keeps safe content such as the text content of the <script> tag. This way it eliminates the risk of script injection attacks. If you still use it then it will be ignored and a warning appears in the browser console. Let's take an example of innerHtml property binding which causes XSS vulnerability,\n" +
                "\n" +
                "export class InnerHtmlBindingComponent {\n" +
                "  // For example, a user/attacker-controlled value from a URL.\n" +
                "  htmlSnippet = 'Template <script>alert(\"0wned\")</script> <b>Syntax</b>';\n" +
                "}"))
        addQuestion(Question(12,"Angular","What is interpolation?","Interpolation is a special syntax that Angular converts into property binding. It’s a convenient alternative to property binding. It is represented by double curly braces({{}}). The text between the braces is often the name of a component property. Angular replaces that name with the string value of the corresponding component property. Let's take an example,\n" +
                "\n" +
                "<h3>\n" +
                "  {{title}}\n" +
                "  <img src=\"{{url}}\" style=\"height:30px\">\n" +
                "</h3>\n" +
                "In the example above, Angular evaluates the title and url properties and fills in the blanks, first displaying a bold application title and then a URL."))
        addQuestion(Question(13,"Angular","What is the difference between pure and impure pipe?","A pure pipe is only called when Angular detects a change in the value or the parameters passed to a pipe. For example, any changes to a primitive input value (String, Number, Boolean, Symbol) or a changed object reference (Date, Array, Function, Object). An impure pipe is called for every change detection cycle no matter whether the value or parameters changes. i.e, An impure pipe is called often, as often as every keystroke or mouse-move."))
        addQuestion(Question(14,"Angular","What are observables?","Observables are declarative which provide support for passing messages between publishers and subscribers in your application. They are mainly used for event handling, asynchronous programming, and handling multiple values. In this case, you define a function for publishing values, but it is not executed until a consumer subscribes to it. The subscribed consumer then receives notifications until the function completes, or until they unsubscribe."))
        addQuestion(Question(15,"Angular","How can you read full response?","The response body doesn't may not return full response data because sometimes servers also return special headers or status code which which are important for the application workflow. Inorder to get full response, you should use observe option from HttpClient,\n" +
                "\n" +
                "getUserResponse(): Observable<HttpResponse<User>> {\n" +
                "  return this.http.get<User>(\n" +
                "    this.userUrl, { observe: 'response' });\n" +
                "}\n" +
                "Now HttpClient.get() method returns an Observable of typed HttpResponse rather than just the JSON data."))
        addQuestion(Question(16,"Angular","How do you perform Error handling?","If the request fails on the server or failed to reach the server due to network issues then HttpClient will return an error object instead of a successful reponse. In this case, you need to handle in the component by passing error object as a second callback to subscribe() method. Let's see how it can be handled in the component with an example,\n" +
                "\n" +
                "fetchUser() {\n" +
                "  this.userService.getProfile()\n" +
                "    .subscribe(\n" +
                "      (data: User) => this.userProfile = { ...data }, // success path\n" +
                "      error => this.error = error // error path\n" +
                "    );\n" +
                "}\n" +
                "It is always a good idea to give the user some meaningful feedback instead of displaying the raw error object returned from HttpClient.\n" +
                "\n"))
        addQuestion(Question(17,"Angular","What is RxJS?","RxJS is a library for composing asynchronous and callback-based code in a functional, reactive style using Observables. Many APIs such as HttpClient produce and consume RxJS Observables and also uses operators for processing observables. For example, you can import observables and operators for using HttpClient as below,\n" +
                "\n" +
                "import { Observable, throwError } from 'rxjs';\n" +
                "import { catchError, retry } from 'rxjs/operators';"))
        addQuestion(Question(18,"Angular","What is subscribing?","An Observable instance begins publishing values only when someone subscribes to it. So you need to subscribe by calling the subscribe() method of the instance, passing an observer object to receive the notifications. Let's take an example of creating and subscribing to a simple observable, with an observer that logs the received message to the console.\n" +
                "\n" +
                "Creates an observable sequence of 5 integers, starting from 1\n" +
                "const source = range(1, 5);\n" +
                "\n" +
                "// Create observer object\n" +
                "const myObserver = {\n" +
                "  next: x => console.log('Observer got a next value: ' + x),\n" +
                "  error: err => console.error('Observer got an error: ' + err),\n" +
                "  complete: () => console.log('Observer got a complete notification'),\n" +
                "};\n" +
                "\n" +
                "// Execute with the observer object and Prints out each item\n" +
                "myObservable.subscribe(myObserver);\n" +
                "// => Observer got a next value: 1\n" +
                "// => Observer got a next value: 2\n" +
                "// => Observer got a next value: 3\n" +
                "// => Observer got a next value: 4\n" +
                "// => Observer got a next value: 5\n" +
                "// => Observer got a complete notification"))
        addQuestion(Question(19,"Angular","What is an observable?","An Observable is a unique Object similar to a Promise that can help manage async code. Observables are not part of the JavaScript language so we need to rely on a popular Observable library called RxJS. The observables are created using new keyword. Let see the simple example of observable,\n" +
                "\n" +
                "import { Observable } from 'rxjs';\n" +
                "\n" +
                "const observable = new Observable(observer => {\n" +
                "  setTimeout(() => {\n" +
                "    observer.next('Hello from a Observable!');\n" +
                "  }, 2000);\n" +
                "});\n"))
        addQuestion(Question(20,"Angular","What is an observer?","Observer is an interface for a consumer of push-based notifications delivered by an Observable. It has below structure,\n" +
                "\n" +
                "interface Observer<T> {\n" +
                "  closed?: boolean;\n" +
                "  next: (value: T) => void;\n" +
                "  error: (err: any) => void;\n" +
                "  complete: () => void;\n" +
                "}\n" +
                "A handler that implements the Observer interface for receiving observable notifications will be passed as a parameter for observable as below,\n" +
                "\n" +
                "myObservable.subscribe(myObserver);\n" +
                "Note: If you don't supply a handler for a notification type, the observer ignores notifications of that type"))
        addQuestion(Question(21,"Angular","What is the short hand notation for subscribe method?","The subscribe() method can accept callback function definitions in line, for next, error, and complete handlers is known as short hand notation or Subscribe method with positional arguments. For example, you can define subscribe method as below,\n" +
                "\n" +
                "myObservable.subscribe(\n" +
                "  x => console.log('Observer got a next value: ' + x),\n" +
                "  err => console.error('Observer got an error: ' + err),\n" +
                "  () => console.log('Observer got a complete notification')\n" +
                ");"))
        addQuestion(Question(22,"Angular","What is metadata rewriting?","Metadata rewriting is the process in which the compiler converts the expression initializing the fields such as useClass, useValue, useFactory, and data into an exported variable, which replaces the expression. Remember that the compiler does this rewriting during the emit of the .js file but not in definition files( .d.ts file)."))
        addQuestion(Question(23,"Angular","What is zone?","A Zone is an execution context that persists across async tasks. Angular relies on zone.js to run Angular's change detection processes when native JavaScript operations raise events"))


    }
    private fun CSSQuestions(){
        addQuestion(Question(1,"CSS3","What is CSS","CSS outline the style of an HTML webpage, it is a language by which we can set the behavior of an HTML webpage. It describes how the HTML content will be shown on screen.\n" +
                "\n\n" +
                "CSS controls the layout of several HTML web pages. CSS is referred to as the Cascading Style Sheet."))
        addQuestion(Question(2,"CSS3","Distinguish between CSS2 and CSS3?","There are several differences between CSS2 and CSS3.\n" +
                "\n" +
                "\n1)\tCSS3 is divided into two various sections which are called as a module. Whereas in CSS2 everything accedes into a single document with all the information in it.\n" +
                "\n2)\tCSS3 modules are supported almost on every browser and on the other hand modules of CSS and CSS2 are not supported in every browser.\n\n" +
                "3)\tIn CSS3 we will find that many graphics related characteristics have been introduced like “Border-radius or box-shadow, flexbox.\n\n" +
                "4)\tIn CSS3, a user can precise multiple background images on a webpage by using properties like background-image, background-position, and background-repeat styles."))
        addQuestion(Question(3,"CSS3","Cite different types of CSS ?","1)\tExternal – These are written in separate files.\n\n" +
                "2)\tInternal – These are cited at the top of the web page code document.\n" +
                "\n3)\tInline – These are written right next to the text."))

        addQuestion(Question(4,"CSS3",") Why is the external style sheet useful?","External style sheet is very useful as we write all the styling codes in a single file and it can be used anywhere by just referencing the link of that external style sheet file.\n" +
                "\n\n" +
                "So if we do any changes in that external file, then the changes can also be observed on the webpage. So we can say that it is very useful and it makes your work easy while working on larger files"))
        addQuestion(Question(5,"CSS3"," How to use CSS selector?","By using CSS selector, we can choose the content which we want to style so that we can say that it is a bridge between the style sheet and the HTML files."))
        addQuestion(Question(6,"CSS3","Explain the concept of Tweening."," Tweening is the process in which we create intermediate frames between two images to get the appearance of the first image which develops into the second image."))

        addQuestion(Question(7,"CSS3"," What are gradients in CSS? ","It is a property of CSS which allows you to display a smooth transformation between two or more than two specified colors.\n" +
                "\n" +
                "There are two types of gradients that are present in CSS. They are:\n" +
                "\n" +
                "\n1)\tLinear gradient\n" +
                "\n2)\tRadial Gradient"))
        addQuestion(Question(8,"CSS3","What is the difference between padding and margin?\n"," In CSS, the margin is the property by which we can create space around elements. We can even create space to the exterior defined borders."))
        addQuestion(Question(9,"CSS3","Explain the concept of pseudo-elements in CSS.","It is a feature of CSS which is used to style the given parts of an element."))
        addQuestion(Question(10,"CSS3","What are CSS3 Transitions?","CSS3 transitions allow you to change property values smoothly (from one value to another), over a given duration."))
        addQuestion(Question(11,"CSS3","What is CSS3 animation ?","When the animation is created in the @keyframe, bind it to a selector, otherwise, the animation will have no effect.\n" +
                "\n" +
                "Bind the animation to a selector by specifying at least these two CSS3 animation properties:\n" +
                "\n\t" +
                "* \tSpecify the name of the animation\n" +
                "* \tSpecify the duration of the animation\n"))
        addQuestion(Question(12,"CSS3","What is CSS3 Flexbox","Flexible boxes, or flexbox, is a new layout mode in CSS3. Flexbox consists of flex containers and flex items.\n\n" +
                "A flex container is declared by setting the display property of an element to either flex (rendered as a block) or inline-flex (rendered as inline).Inside a flex container, there are one or more flex items."))
        addQuestion(Question(13,"CSS3","Which property is used to change the face of a font?","The font-family property is used to change the face of a font."))
        addQuestion(Question(14,"CSS3","Which property is used to make a font italic or oblique?","The font-style property is used to make a font italic or oblique."))
        addQuestion(Question(15,"CSS3","Which property is used to create a small-caps effect?","The font-variant property is used to create a small-caps effect.\n" +
                "\n"))

    }
    private fun BootstrapQuestions(){
        addQuestion(Question(1,"BootStrap","What is Twitter Bootstrap?","Bootstrap is a sleek, intuitive, and powerful mobile first front-end framework for faster and easier web development. It uses HTML, CSS and Javascript.\n" +
                "\n"))

        addQuestion(Question(2,"BootStrap","What are Offset columns?","Offsets are a useful feature for more specialized layouts. They can be used to push columns over for more spacing, for example. The .col-xs = * classes don't support offsets, but they are easily replicated by using an empty cell."))
        addQuestion(Question(3,"BootStrap","How can you order columns in Bootstrap?","You can easily change the order of built-in grid columns with .col-md-push-* and .col-md-pull-* modifier classes where * range from 1 to 11.>"))
        addQuestion(Question(4,"BootStrap","How do you make images responsive?p","Bootstrap 3 allows to make the images responsive by adding a class .img-responsive to the <img> tag. This class applies max-width: 100%; and height: auto; to the image so that it scales nicely to the parent element.\n" +
                "\n"))
        addQuestion(Question(5,"BootStrap","What is Normalize in Bootstrap?","Bootstrap uses Normalize to establish cross browser consistency.\n" +
                "\n" +
                "Normalize.css is a modern, HTML5-ready alternative to CSS resets. It is a small CSS file that provides better cross-browser consistency in the default styling of HTML elements"))
        addQuestion(Question(6,"BootStrap","What are glyphicons?","Glyphicons are icon fonts which you can use in your web projects. Glyphicons Halflings are not free and require licensing, however their creator has made them available for Bootstrap projects free of cost."))
        addQuestion(Question(7,"BootStrap","How do you use Glyphicons?","To use the icons, simply use the following code just about anywhere in your code. Leave a space between the icon and text for proper padding.\n" +
                "\n\n" +
                "<span class = \"glyphicon glyphicon-search\"></span>"))
        addQuestion(Question(8,"BootStrap","What is a transition plugin?","The transition plugin provides simple transition effects such as Sliding or fading in modals."))
        addQuestion(Question(9,"BootStrap","What is a Modal Plugin?","A modal is a child window that is layered over its parent window. Typically, the purpose is to display content from a separate source that can have some interaction without leaving the parent window. Child windows can provide information, interaction, or more."))
        addQuestion(Question(10,"BootStrap","What is Bootstrap caraousel?","The Bootstrap carousel is a flexible, responsive way to add a slider to your site. In addition to being responsive, the content is flexible enough to allow images, iframes, videos, or just about any type of content that you might want.>"))
        addQuestion(Question(11,"BootStrap","What is button group","Button groups allow multiple buttons to be stacked together on a single line. This is useful when you want to place items like alignment buttons together.\n" +
                "\n"))
        addQuestion(Question(12,"BootStrap","Which class is used for basic button group",".btn-group class is used for a basic button group. Wrap a series of buttons with class .btn in .btn-group."))
        addQuestion(Question(13,"BootStrap","Which class is used to draw a toolbar of buttons",".btn-toolbar helps to combine sets of <div class = \"btn-group\"> into a <div class = \"btn-toolbar\"> for more complex components.\n" +
                "\n"))
        addQuestion(Question(14,"BootStrap","What are input groups?","You can stack the pills vertically using the class .nav-stacked along with the classes: .nav, .nav-pills."))
        addQuestion(Question(15,"BootStrap","What are bootstrap labels","Bootstrap labels are great for offering counts, tips, or other markup for pages. Use class .label to display labels.\n" +
                "\n"))


    }
    private fun JavaScriptQuestions(){
        addQuestion(Question(1,"JavaScript","What is JavaScript","JavaScript is a scripting language. It is different from Java language. It is object-based, lightweight, cross-platform translated language. It is widely used for client-side validation. The JavaScript Translator (embedded in the browser) is responsible for translating the JavaScript code for the web browser. "))
        addQuestion(Question(2,"JavaScript","List some features of JavaScript.","*)\tLightweight\n" +
                "*)\tInterpreted programming language\n" +
                "*)\tGood for the applications which are network-centric\n" +
                "*)\tComplementary to Java\n" +
                "*)\tComplementary to HTML\n" +
                "*)\tOpen source\n" +
                "\tCross-platform"))
        addQuestion(Question(3,"JavaScript","List some of the advantages of JavaScript.","*)\tServer interaction is less\n" +
                "*)\tFeedback to the visitors is immediate\n" +
                "*)\tInteractivity is high\n" +
                "*)\tInterfaces are richer\n"))
        addQuestion(Question(4,"JavaScript","List some of the disadvantages of JavaScript.t","*)\tNo support for multithreading\n" +
                "*)\tNo support for multiprocessing\n" +
                "*)\tReading and writing of files is not allowed\n" +
                "*)\tNo support for networking applications."))
        addQuestion(Question(5,"JavaScript","Can an anonymous function be assigned to a variable?t","Yes, you can assign an anonymous function to a variable.\n" +
                "\n>"))
        addQuestion(Question(6,"JavaScript","If we want to return the character from a specific index which method is used?","The JavaScript string charAt() method is used to find out a char value present at the specified index. The index number starts from 0 and goes to n-1, where n is the length of the string. The index value can't be a negative, greater than or equal to the length of the string. \n The JavaScript string charAt() method is used to find out a char value present at the specified index. The index number starts from 0 and goes to n-1, where n is the length of the string. The index value can't be a negative, greater than or equal to the length of the string. "))
        addQuestion(Question(7,"JavaScript"," What is the real name of JavaScript?","The original name was Mocha, a name chosen by Marc Andreessen, founder of Netscape. In September of 1995, the name was changed to LiveScript. In December 1995, after receiving a trademark license from Sun, the name JavaScript was adopted."))
        addQuestion(Question(8,"JavaScript","What is the difference between undefined value and null value?","* \tUndefined value: A value that is not defined and has no keyword is known as undefined value. For example:\n" +
                "\n" +
                "\tint number;//Here, a number has an undefined value.  \n" +
                "* \tNull value: A value that is explicitly specified by the keyword \"null\" is known as a null value. For example:\n" +
                "\n" +
                "String str=null;//Here, str has a null value.  "))
        addQuestion(Question(9,"JavaScript","What is the difference between View state and Session state?","\"View state\" is specific to a page in a session whereas \"Session state\" is specific to a user or browser that can be accessed across all pages in the web application.\n" +
                "\n>"))
        addQuestion(Question(10,"JavaScript"," Is JavaScript faster than ASP script?","Yes, because it doesn't require web server's support for execution.\n" +
                "\n"))
        addQuestion(Question(11,"JavaScript"," How to change the background color of HTML document using JavaScript?","document.body.bgColor=\"pink\";  \n"))
        addQuestion(Question(12,"JavaScript","What is the use of a Map object in JavaScript?","The JavaScript Map object is used to map keys to values. It stores each element as key-value pair. It operates the elements such as search, update and delete on the basis of specified key. For example:\n" +
                "\n\nfunction display()  \n" +
                "{  \n" +
                "var map=new Map();    \n" +
                "map.set(1,\"jQuery\");    \n" +
                "map.set(2,\"AngularJS\");    \n" +
                "map.set(3,\"Bootstrap\");    \n" +
                "document.writeln(map.get(1)+\"<br>\");    \n" +
                "document.writeln(map.get(2)+\"<br>\");    \n" +
                "document.writeln(map.get(3));    \n" +
                "}  \n" +
                "display();  "))
        addQuestion(Question(13,"JavaScript","What is negative infinity?t","Negative Infinity is a number in JavaScript which can be derived by dividing negative number by zero.\n" +
                "\n"))
        addQuestion(Question(14,"JavaScript","What are undeclared and undefined variables?","Undeclared variables are those that do not exist in a program and are not declared. If the program tries to read the value of an undeclared variable, then a runtime error is encountered.\n" +
                "\n" +
                "Undefined variables are those that are declared in the program but have not been given any value. If the program tries to read the value of an undefined variable, an undefined value is returned.\n" +
                "\n"))
        addQuestion(Question(15,"JavaScript","What is a prompt box?","A prompt box is a box which allows the user to enter input by providing a text box. Label and box will be provided to enter the text or number."))
        addQuestion(Question(16,"JavaScript","What is 'this' keyword in JavaScript?","'This' keyword refers to the object from where it was called.\n" +
                "\n"))

    }





    fun addQuestion(question: Question) {
        val values = ContentValues()
        values.put(COLUMN_category, question.category)
        values.put(COLUMN_answer,question.answer)
        values.put(COLUMN_question,question.question)
        dbLocal!!.insert(TABLE_NAME, null, values)
    }


    fun getQuestionsByCategory(category:String):ArrayList<Question>?{
       dbLocal = this.readableDatabase
        val query = "SELECT * FROM $TABLE_NAME WHERE $COLUMN_category = \"$category\""
        val cursor = dbLocal!!.rawQuery(query, null)
        val questions= ArrayList<Question>()
        cursor!!.moveToFirst()

        val id1 = Integer.parseInt(cursor.getString(0))
        val ca1 =cursor.getString(1)
        val question1 = cursor.getString(3)
        val answer1 = cursor.getString(2)

        val q = Question(id1,ca1,question1,answer1)

        questions.add(q)
        while (cursor.moveToNext()) {
            val id = Integer.parseInt(cursor.getString(0))
            val ca =cursor.getString(1)
            val question = cursor.getString(3)
            val answer = cursor.getString(2)
            val q1 = Question(id,ca,question,answer)
            questions.add(q1)
        }
        cursor.close()
        return questions
    }

    companion object {
        private val DATABASE_VERSION = 2
        private val DATABASE_NAME = "neuInterview.db"
        val TABLE_NAME = "neuInterview"
        val COLUMN_ID = "_id"
        val COLUMN_category = "category"
        val COLUMN_question = "question"
        val COLUMN_answer = "answer"
    }
}