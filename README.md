![OS](https://badgen.net/badge/OS/Android?icon=https://raw.githubusercontent.com/androiddevnotes/awesome-android-kotlin-apps/master/assets/android.svg&color=3ddc84)
![Language](https://img.shields.io/github/languages/top/cortinico/kotlin-android-template?color=blue&logo=kotlin)

# Linxo R & D
This app is the result of a **Linxo Coding Exercise**.

In brief, there is two screens:
 * Album list
 * Gallery

Note: An album has a _name_, an _author_ and a _gallery_, which is a set of _photos_.

## API Endpoints
* albums: [https://jsonplaceholder.typicode.com/albums](https://jsonplaceholder.typicode.com/albums)
* users: [https://jsonplaceholder.typicode.com/users](https://jsonplaceholder.typicode.com/users)
* photos: [https://jsonplaceholder.typicode.com/photos](https://jsonplaceholder.typicode.com/photos)

## Libraries
* [_Retrofit_](https://square.github.io/retrofit/) for network communication, exchange data with a third party.
* _Picasso_ for displaying images from the web, it's light and simple (no need to use _Glide_).

## Good Practices

Component Architecture:
* **MVVM** Model View ViewModel
* Network data source in the data layer
* _Navigation_
* _View Binding_
* _LiveData_
* _Coroutines_

## To improve
-> Add a setting screen to explore _compose_ interest

## Organization
To deal with this project, I plan:
* put in place the **component architecture** (sem. 20)
* develop the second screen (sem. 21)


| Time | Task |
|------|------|
|1 hour | Creating Hello Linxo! |
|3 hours| Developing first screen |

[Macha DA COSTA on LinkedIn](https://www.linkedin.com/in/MachaDaCosta/)

## References
[developer.android.com: Android Development with Kotlin lessons](https://developer.android.com/courses/android-development-with-kotlin/course?utm_source=dac&utm_medium=website&utm_campaign=edu)

[Kotlin for Android App by Da Costa](https://www.chillcoding.com/app/kotlin-for-android/)
