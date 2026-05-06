# Review Journal

The cases below are the review handles I would use before changing the implementation.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its observability focus without claiming live deployment or external usage.

## Cases

- `baseline`: `span volume`, score 141, lane `ship`
- `stress`: `latency skew`, score 104, lane `hold`
- `edge`: `signal loss`, score 175, lane `ship`
- `recovery`: `incident shape`, score 189, lane `ship`
- `stale`: `span volume`, score 177, lane `ship`

## Note

The repository should be understandable without pretending it is larger than it is.
