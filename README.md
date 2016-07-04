# City.Risks-WP3
City.Risks SDK Git

This is the developed SDK of the City.Risks Project

The City.Risks SDK will be a “software development kit” for cities and developers that aims at harmonizing application programming interfaces (APIs). This will enable new services and applications to be rapidly developed, scaled and reused through providing a range of tools and information for both cities and developers.
An SDK is a library that is often bundled with extra tool applications, data files, and sample code that aids you in developing code for a particular system. 
In addition the SDK also contains the emulators required to test apps. Utilities to interact with physical devices. Sample applications highlighting different features of the included libraries. Documentation for include libraries. etc. The SDK contains all the required elements to begin developing for the corresponding platform . 
Platform SDKs are required to develop apps for a platform. For example, the Windows 8.1 SDK is required to develop apps for Windows 8.1 . 
An SDK is more than just a set of APIs provided to developers. A complete SDK provides a consumer focused API for interacting with the system, and it additionally includes: 
•	Documentation aimed at users consuming the SDK and system. 
•	Clear examples of usage, including functioning, executable examples.
•	The SDK may optionally include tools to help developers use the SDK, such as IDE plugins or batch scripts.
It essentially acts as a generator of applications compatible with the City.Risks core platform
The main features of the City.Risks SDK will be:
•	Online – resources will be freely available and online
•	Accessible – the project uses open data and source code will be made available through Github through open licenses. Where there is a requirement to register to an API or service this will be to ensure that we can provide the necessary support to users, and ensure consistency of service for existing users.
•	Reliable – these APIs will be tested with the partner cities and so will be evaluated through a number of quality control processes to get to this point.
•	Commitment – partner cities commitment to the project means that the majority of open data sets required will be available and in a trusted format.
•	Best Practice – we are committed to developing best practice examples, for instance through the adoption of particular standards or processes.
•	Scalable – the SDK will have the ability to continue to function well even when user needs change in size or volume. 
We will develop a modular flexible kit, comprising advanced risk management and response algorithms and tools operating on top of an enriched and enhanced content repository for security related information. 
Over the years, many software engineering activities have relied on the automated support afforded by tools. In order to maximize the benefits provided by tools, they are often retrofitted to pre-existing development environments that enable them to capitalize on facilities provided by compilers, debuggers, and profilers. Integrated Development Environments (IDEs), for instance, comprise a myriad of tightly-knit tools (i.e., plugins) designed to boost programmer productivity. Due to the advantages that such integrated environments have brought to the mainstream, they have become a de facto standard to implement complex software systems .
The City.Risks  SDK will be created on the Eclipse IDE. Eclipse provides IDEs and platforms nearly every language and architecture. It is well established for its Java IDE, C/C++, JavaScript and PHP IDEs built on extensible platforms for creating desktop, Web and cloud IDEs. These platforms deliver the most extensive collection of add-on tools avaialable for software developers . 
The SDK will take the IDE’s capabilities and the .jar files developed by the consortium to create a Java application. This application will act as an interface between the core platform and third party developers.
The City.Risks SDK will include a central Programming Interface, a Debugger, and a Visual Editor
8.1. Central Programming Interface
The Central Programming Interface will be an essential part of the SDK, as it will help third party developers to write applications that request services or resources from the core platform.
It will use the following packages to edit the RunTime, the WorkSpace and the WorkBench:

#Platform Runtime Packages
org.eclipse.core.runtime
Provides core support for plug-ins and the plug-in registry.
#Workspace Packages
org.eclipse.core.resources
Provides basic support for managing a workspace and its resources.
#Workbench Packages
org.eclipse.jface.action
Provides support for shared UI resources such as menus, tool bars, and status lines.
org.eclipse.jface.dialogs
Provides support for dialogs.
org.eclipse.jface.operation
Provides JFace support for long-running operations.
org.eclipse.jface.preference
Provides a framework for preferences.
org.eclipse.swt
SWT constants and error handling support.
org.eclipse.ui
Application programming interfaces for interaction with and extension of the Eclipse Platform User Interface.
 
#8.2. Debugger
The  debugger will be used for fixing program errors. We will use the JDT debugger, with which we can execute Java programs line by line and examine the value of variables at different points in the program 
#8.3. Visual Editor
The visual editor will allow developers to create and edit the program's graphical user interface (GUI). This will utilise developments to other Eclipse and Java projects (e.g. Visual Editor Project (VEP), Java Development Tools (JDT), Plug-in Development Environment (PDE), e Web Standard Tools (WST)). 
We will use (among others):
•	WindowBuilder Engine — the core extensible framework providing support for all of the features listed above.
•	SWT Designer — an exemplary implementation of an GUI design tool that supports SWT, JFace, RCP, eRCP and XWT. This tool also provides excellent support for the Nebula widget collection and the Eclipse Data Binding framework.
•	Swing Designer — an exemplary implementation of an GUI design tool that supports Swing. This tool also provides excellent support for 3rd party layout managers such as JGoodies FormLayout and MiGLayout as well as support for the Swing Data Binding framework.
#8.4. Other SDK Components
The developed SDK, like most, will contain sample code, which provides developers with example programs and libraries. These samples will help developers learn how to build basic programs with the SDK, which will enable them to eventually create more complex applications. 
Finally the City.Risks SDK will also offer technical documentation, which includes tutorials and FAQs. 
The City.Risks SDK will be an open source software that will be available to developers through the project’s website and hosted on GitHub. This way it will be a tool for the sustainability of the project and make our solutions available to other developers for similar applications.
