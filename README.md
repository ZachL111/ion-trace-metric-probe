# ion-trace-metric-probe

`ion-trace-metric-probe` is a Scala project in observability. Its focus is to package a Scala local lab for metric analysis with deny and allow fixtures, explainable decision traces, and documented operating limits.

## Why This Exists

This is intentionally local and self-contained so it can be inspected without credentials, services, or seeded history.

## Ion Trace Metric Probe Review Notes

`recovery` and `stress` are the cases worth reading first. They show the optimistic and cautious ends of the fixture.

## Capabilities

- `fixtures/domain_review.csv` adds cases for span volume and latency skew.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/ion-trace-metric-walkthrough.md` walks through the case spread.
- The Scala code includes a review path for `incident shape` and `latency skew`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Implementation Shape

The implementation keeps the scoring rule plain: reward signal and confidence, preserve slack, penalize drag, then classify the result into a review lane.

The Scala addition stays small enough to inspect in one sitting.

## Local Usage

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Verification

The same command runs the local verification path. The highest-scoring domain case is `recovery` at 189, which lands in `ship`. The most cautious case is `stress` at 104, which lands in `hold`.

## Roadmap

The repository is intentionally scoped to local checks. I would expand it by adding adversarial fixtures before adding features.
