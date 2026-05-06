# Field Notes

I would read this project from the data inward: cases first, implementation second.

The domain cases cover `span volume`, `latency skew`, `signal loss`, and `incident shape`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

`recovery` is the strongest case at 189 on `incident shape`. `stress` is the cautious anchor at 104 on `latency skew`.

The language-specific addition keeps the review model in case classes and a runner check.
