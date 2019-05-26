require: script.js

theme: /Chuck Norris Joke
  state: Random
    e!: chuck norris joke
    script:
      $temp.joke = ChuckNorrisJoke.random()
    if: $temp.joke
      script:
        Aimybox.question().text($temp.joke).button("Tell another one")
    else:
      a: Sorry, Chuck Norris is busy now...

    state: Tell another
      e!: tell another
      e!: next

      go!: ../

