String regexp = /(\(0\d{2,4}\)\s?)?[1-9]\d{2,}(\-\d{1,})}?/

println "29289" ==~ regexp
println "292-6765" ==~ regexp

println "(0631) 292" ==~ regexp
println "(0631) 29280" ==~ regexp

String newregexp = /[A-Z][a-zA-Z_0-9\-\.]*_[1-9]\d*_[a-z]?/

println "Paul-Wittsack-Str. 10" ==~ newregexp

name = /[a-zA-Z][a-zA-Z0-9_\-]*(\.[a-zA-Z][a-zA-Z0-9_\-]*)*/
domain = /[a-zA-Z][a-zA-Z0-9_\-]*(\.[a-zA-Z][a-zA-Z0-9_\-]*)*/
regExpnew2 = /$name@$domain/

println "jack@hotmail.com" ==~ regExpnew2