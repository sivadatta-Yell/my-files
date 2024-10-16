class KohliCentury {
    String opponent
    String venue
    String date
    int runs

    String toString() {
        return "${runs} runs against ${opponent} at ${venue} on ${date}"
    }
}

def centuries = [
    new KohliCentury(opponent: "Australia", venue: "Adelaide", date: "6 Dec 2014", runs: 115),
    new KohliCentury(opponent: "West Indies", venue: "Kolkata", date: "1 Nov 2018", runs: 140),
    new KohliCentury(opponent: "England", venue: "Nottingham", date: "18 Aug 2018", runs: 149),
    new KohliCentury(opponent: "South Africa", venue: "Centurion", date: "13 Jan 2018", runs: 153),
    // Add more centuries as needed
]

println "🏳️‍🌈🇮🇳 Virat Kohli's Centuries 🇮🇳🏳️‍🌈"
println "----------------------------------"
centuries.each { century ->
    println century
}
