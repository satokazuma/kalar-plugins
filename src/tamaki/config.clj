(ns tamaki.config)


(def config
  (letfn [(cat [tail] (symbol "tamaki.hook.hook" tail))]
    {:recent-post-num 3
     :report-dir "resources/_report"
     :lwml {:md ""}
     :build "build"
     :hooks {:clean [(cat "clean")]
             :initialize [(cat "initialize")]
             :process-resources [(cat "process-resources")]
             :do-compilation [(cat "do-compilation")]}}))
