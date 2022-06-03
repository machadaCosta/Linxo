![OS](https://badgen.net/badge/OS/Android?icon=https://raw.githubusercontent.com/androiddevnotes/awesome-android-kotlin-apps/master/assets/android.svg&color=3ddc84)
![Language](https://img.shields.io/github/languages/top/cortinico/kotlin-android-template?color=blue&logo=kotlin)

# Linxo R & D
This app is the result of a **Linxo Coding Exercise**.

In brief, there are two screens:
 * Album list
 * Gallery

Note: An album has a _name_, an _author_ and a _gallery_, which is a set of _photos_.

![GIF demo](app/src/main/linxo-demo-app.gif)

## API
[Fake API: jsonplaceholder.typicode.com](https://jsonplaceholder.typicode.com/)

## Libraries
* [_Retrofit_](https://square.github.io/retrofit/) for network communication, exchange data with a third party.
* [_Moshi_](https://github.com/square/retrofit/tree/master/retrofit-converters/moshi) for converting JSON into _Kotlin_ objects (there is also [_Gson_](https://github.com/google/gson), _Moshi_ is used in the official codelab cf. **References** 1 lesson 9).
* [_Picasso_](https://github.com/square/picasso) for displaying images from the web, it's light and simple (no need to use [_Glide_](https://github.com/bumptech/glide) which is useful for _.gif_ and loading optimization).
* [_Timber_](https://github.com/JakeWharton/timber) for logging, it's generate log tag and avoid showing logs in a release version.

## Good Practices

The _MAD_ architecture, Architecture Components, is put in place:
* **MVVM** Model View ViewModel
* _Navigation_
* _View Binding_
* _LiveData_
* _Coroutines_

Note: _MAD_ stands for _Modern Android Development_

See [Documentation of Linxo R & D Project](https://github.com/machadaCosta/Linxo/wiki/Documentation) for more information.

## To improve, suggestions
-> Add a screen of settings to explore _compose_ interest (using [_DataStore_](https://developer.android.com/topic/libraries/architecture/datastore))

-> Add tests

-> Use _Hint_ for _Dependency Injection_ and remove the ViewModelFactory

-> Optimize the requests progress

-> Improve the UI of second screen with _Compose_

## Organization
To deal with this project, I plan:
* put in place the **MAD architecture** (sem. 20)
* develop the second screen (sem. 21)


| Time | Task |
|------|------|
| **sem. 20**| **Developing the first screen: v1**|
|1 hour | Creating Hello Linxo! |
|1 hour | Setting up the _MAD_ architecture |
|2 hours| Developing _data layer_ v0 with _MVVM_ |
|2 hours | Writing Documentation |
| **sem. 21**| **Developing the second screen: v2**|
|1 hour| Developing _data layer_ (v1) |
|1 hour| Developing _UI layer_: first screen (v1) |
|1 hour| Developing _UI layer_: navigation to the second screen (v2) |
|1 hour| Updating Documentation |
| **sem. 22**| **Finishing the app**|
|1 hour| Developing _data layer_ and _UI layer_: second screen (v2) |
|1 hour| Updating Documentation |


[Macha DA COSTA on LinkedIn](https://www.linkedin.com/in/MachaDaCosta/)

## References
1. [developer.android.com: Android Development with Kotlin lessons](https://developer.android.com/courses/android-development-with-kotlin/course?utm_source=dac&utm_medium=website&utm_campaign=edu)

2. [chillcoding.com: Kotlin for Android App by Da Costa](https://www.chillcoding.com/app/kotlin-for-android/)

3. [linxo.com: Application sécurisée pour la gestion de comptes bancaires, optimisation du budget (FR)](https://www.linxo.com/)
