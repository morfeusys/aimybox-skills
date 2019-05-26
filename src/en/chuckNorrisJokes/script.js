var ChuckNorrisJoke = (function () {

    function getRandomJoke() {
        var res = $http.get("https://api.chucknorris.io/jokes/random");
        return res.isOk ? res.data['value'] : null;
    }

    return {
        random: getRandomJoke
    }
})();