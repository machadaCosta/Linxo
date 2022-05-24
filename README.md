![OS](https://badgen.net/badge/OS/Android?icon=https://raw.githubusercontent.com/androiddevnotes/awesome-android-kotlin-apps/master/assets/android.svg&color=3ddc84)
![Language](https://img.shields.io/github/languages/top/cortinico/kotlin-android-template?color=blue&logo=kotlin)

# Linxo R & D
This app is the result of a **Linxo Coding Exercise**.

In brief, there is two screens:
 * Album list
 * Gallery

Note: An album has a _name_, an _author_ and a _gallery_, which is a set of _photos_.

## API
[Fake API: jsonplaceholder.typicode.com](https://jsonplaceholder.typicode.com/)

## Libraries
* [_Retrofit_](https://square.github.io/retrofit/) for network communication, it's a safe-type HTTP client.
* [_Moshi_](https://github.com/square/retrofit/tree/master/retrofit-converters/moshi) for converting JSON into _Kotlin_ objects (there is also _Gson_, _Moshi_ is used in the official codelab cd. References 1 lesson 9).
* [_Picasso_](https://github.com/square/picasso) for displaying images from the web, it's light and simple (no need to use _Glide_ which is useful for _.gif_ and loading optimization).
* [_Timber_](https://github.com/JakeWharton/timber) for logging, it's generate log tag and avoid showing logs in a release version.

## Good Practices

The _MAD_ architecture, Architecture Components:
* Network data source in the data layer
* **MVVM** Model View ViewModel
* _Navigation_
* _View Binding_
* _LiveData_
* _Coroutines_

Note: _MAD_ stands for _Modern Android Development_

## To improve
-> Add a setting screen to explore _compose_ interest (using [_DataStore_](https://developer.android.com/topic/libraries/architecture/datastore))

## Organization
To deal with this project, I plan:
* put in place the **MAD Architecture** (sem. 20)
* develop the second screen (sem. 21)


| Time | Task |
|------|------|
|1 hour | Creating Hello Linxo! |
|1 hour | Setting up the _MAD_ architecture |
|2 hours| Developing _data layer_ v0 with _MVVM_ |
|2 hours | Writing Documentation |
|n hours| **TO DO** |
|1 hour| Developing _data layer_ v1 |
|1 hour| Developing _UI layer_: first screen (v1) |
|1 hour| Developing _data layer_ v2 |
|1 hour| Developing _UI layer_: first screen (v2) |
|1 hour| Updating Documentation |


[Macha DA COSTA on LinkedIn](https://www.linkedin.com/in/MachaDaCosta/)

## References
1. [developer.android.com: Android Development with Kotlin lessons](https://developer.android.com/courses/android-development-with-kotlin/course?utm_source=dac&utm_medium=website&utm_campaign=edu)

2. [chillcoding.com: Kotlin for Android App by Da Costa](https://www.chillcoding.com/app/kotlin-for-android/)

3. [linxo.com: Application sécurisée pour la gestion de comptes bancaires, optimisation du budget (FR)](https://www.linxo.com/)
