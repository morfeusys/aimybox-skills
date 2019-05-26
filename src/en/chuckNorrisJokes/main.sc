require: script.js

theme: /Chuck Norris Joke
  state: Random
    e!: chuck norris joke
    script:
      $temp.joke = ChuckNorrisJoke.random()

    if: $temp.joke
      script:
        Aimybox.question()
          .image("https://assets.chucknorris.host/img/chucknorris_logo_coloured_small@2x.png")
          .text($temp.joke)
          .text("Want more?")
          .buttons("Tell another one", "No")

    else:
      a: Sorry, Chuck Norris is busy now...

    state: Tell another
      e!: tell another
      e!: next

      go!: ../

    state: Exit
      e!: no
      a: Okay man, no more jokes about Chuck
