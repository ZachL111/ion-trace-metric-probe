# Ion Trace Metric Probe Walkthrough

The fixture is intentionally compact, so the review starts with the cases that pull farthest apart.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | span volume | 141 | ship |
| stress | latency skew | 104 | hold |
| edge | signal loss | 175 | ship |
| recovery | incident shape | 189 | ship |
| stale | span volume | 177 | ship |

Start with `recovery` and `stress`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

`recovery` is the optimistic case; use it to make sure the scoring path still rewards strong signal.
